package com.example.tododemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.google.gson.Gson;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class MainActivity extends AppCompatActivity {
    public static final int SUCCESS = 1;
    public static final int FAIL = 2;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private static final String TAG = "MainActivity";

    private MyEditText user,psw;
    private Button login;
    private TextView userHint,pswHint;
    private Drawable drawable_user,drawable_psw;//用户，密码图片资源
    private Drawable drawable_delete;//删除图片资源
    private String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBar();//设置默认ActionBar隐藏



        //设置drawableStart图片大小
        user =  findViewById(R.id.et_user);
        drawable_user = getResources().getDrawable(R.drawable.account);
        drawable_user.setBounds(0,0,60,60);
        drawable_delete = getResources().getDrawable(R.drawable.delete);
        drawable_delete.setBounds(0,0,60,60);
        user.setCompoundDrawables(drawable_user,null,drawable_delete,null);
        psw = findViewById(R.id.et_psw);
        drawable_psw = getResources().getDrawable(R.drawable.password);
        drawable_psw.setBounds(0,0,60,60);
        psw.setCompoundDrawables(drawable_psw,null,drawable_delete,null);
        setDelete();
        login = findViewById(R.id.btn_login);
        userHint = findViewById(R.id.tv_user_hint);
        pswHint = findViewById(R.id.tv_psw_hint);
        preferences = getSharedPreferences("login", MODE_PRIVATE);
        boolean isRemember = preferences.getBoolean("remember_password",false);
        if (isRemember){
            String account = preferences.getString("account","");
            String password = preferences.getString("password","");
            user.setText(account);
            psw.setText(password);
        }
        this.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }
    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            editor = preferences.edit();
            switch (msg.what){
                case SUCCESS:
                    editor.putBoolean("remember_password",true);
                    editor.putString("account",user.getText().toString().trim());
                    editor.putString("password",psw.getText().toString());
                    Toast.makeText(MainActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                    break;
                case FAIL:
                    editor.putBoolean("remember_password",false);
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("Incorrect username or password！")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).setCancelable(false)
                            .show();
                    break;
                default:
                    break;
            }
        }
    };

    //设置输入框删除Drawable的点击事件
    private void setDelete(){
        user.setDrawableRightListener(new MyEditText.DrawableRightListener() {
            @Override
            public void onDrawableRightClick(View view) {
                user.setText("");
            }
        });
        psw.setDrawableRightListener(new MyEditText.DrawableRightListener() {
            @Override
            public void onDrawableRightClick(View view) {
                psw.setText("");
            }
        });
    }

    public void setActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
    }

    //登录
    private void login(){
        //非空验证
        if (user.getText().toString().trim().isEmpty() && psw.getText().toString().isEmpty()){
            userHint.setVisibility(View.VISIBLE);
            pswHint.setVisibility(View.VISIBLE);
        }else if (user.getText().toString().trim().isEmpty() && !psw.getText().toString().isEmpty()){
            userHint.setVisibility(View.GONE);
            pswHint.setVisibility(View.VISIBLE);
        }else if (!user.getText().toString().trim().isEmpty() && psw.getText().toString().isEmpty()){
            userHint.setVisibility(View.GONE);
            pswHint.setVisibility(View.VISIBLE);
        }else{
            userHint.setVisibility(View.GONE);
            pswHint.setVisibility(View.GONE);
            sendRequestWithOkHttp(user.getText().toString().trim(),psw.getText().toString());
        }
    }

    //获取服务器返回数据字段status，并验证是否为ok，如果是登录成功，不是，登录失败
    private void sendRequestWithOkHttp(String userName ,String psw){
        PersistentCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(MainActivity.this));
        OkHttpClient client = new OkHttpClient();
        client.newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .cookieJar(cookieJar)// 设置封装好的cookieJar
                .build();
        MultipartBody multipartBody = new MultipartBody.Builder()
                .addFormDataPart("signed_body","6b98ef97fadf53417e1b7effd511236ec46b157a386852b67a0a0862a411c6d8." +
                        "{\"_csrftoken\":\"2435840e7eb34784eac33b2b391818eb\",\"_uuid\":\"4cf0f1b2-6cf0-41cb-9cc6-f489c77eeb8b\",\"device_id\":" +
                        "\"4cf0f1b2-6cf0-41cb-9cc6-f489c77eeb8b\",\"from_reg\":false,\"password\":\"" +
                        psw
                        + "\",\"username\":\"" +
                        userName
                        + "\"}")
                .build();
        final Request request = new Request.Builder()
                .url("http://croatia.followertrack.com/api/v1/accounts/login")
                .addHeader("User-Agent","Shenwa")
                .addHeader("em","Shenwa")
                .post(multipartBody)
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response)  {
                if (response.isSuccessful()){
                    try {
                        String result = response.body().string();//拿到返回的json对象
                        Log.d(TAG, result);
                        status = parseJSONWithGSON(result);
                        Log.d(TAG, "status:" + status);
                        Message message = new Message();
                        if ("ok".equals(status)){
                            message.what = SUCCESS;
                            handler.sendMessage(message);
                            Log.d(TAG, "登录成功！");
                            Intent intent = new Intent(MainActivity.this,MainScreen.class);
                            startActivity(intent);
                        }else {
                            message.what = FAIL;
                            handler.sendMessage(message);
                            Log.d(TAG, "登录失败！");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }

    public String parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        LoginGson loginGson = gson.fromJson(jsonData,LoginGson.class);
        return loginGson.getStatus();
    }
}