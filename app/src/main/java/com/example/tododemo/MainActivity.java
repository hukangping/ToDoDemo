package com.example.tododemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private MyEditText user,psw;
    private Button login;
    private TextView userHint,pswHint;
    private Drawable drawable_user,drawable_psw;//用户，密码图片资源
    private Drawable drawable_delete;//删除图片资源

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
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

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

    private void setActionBar(){
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
            
        }
    }


}