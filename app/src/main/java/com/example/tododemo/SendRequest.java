package com.example.tododemo;


import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SendRequest {
    private static final String TAG = "SendRequest";
    private void sendRequestWithOkHttp(){
        OkHttpClient client = new OkHttpClient();
        MultipartBody multipartBody = new MultipartBody.Builder()
                .addFormDataPart("signed_body","6b98ef97fadf53417e1b7effd511236ec46b157a386852b67a0a0862a411c6d8." +
                        "{\"_csrftoken\":\"2435840e7eb34784eac33b2b391818eb\",\"_uuid\":\"4cf0f1b2-6cf0-41cb-9cc6-f489c77eeb8b\",\"device_id\":" +
                        "\"4cf0f1b2-6cf0-41cb-9cc6-f489c77eeb8b\",\"from_reg\":false,\"password\":\"" +
                        "ty123456" + "\",\"username\":\"" + "billyson007" + "\"}")
                .build();

        Request request = new Request.Builder()
                .url("http://croatia.followertrack.com/api/v1/accounts/login")
                .addHeader("User-Agent","Shenwa")
                .addHeader("em","Shenwa")
                .addHeader("Content-Type","text/html;charset=utf-8")
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
                response.body();//拿到返回的json数据
            }
        });

    }

}
