package com.example.moocapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initData();
    }

    public void initData(){
        //HttpUrlConnection
        /**
         * 1,实例化一个url对象
         * 2，获取HttpUrlConnection对象
         * 3，设置请求连接属性
         * 4，获取响应码，判断是否连接成功
         * 5，读取输入流并解析
         */
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    URL url = new URL("http://www.imooc.com/api/teacher?type=3&cid=1");
                    HttpURLConnection coon = null;
                    try {
                        coon = (HttpURLConnection) url.openConnection();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        coon.setRequestMethod("GET");
                    } catch (ProtocolException e) {
                        e.printStackTrace();
                    }
                    coon.setReadTimeout(6000);
                    //
                    try {
                        if (coon.getResponseCode() == 200) {
                            InputStream in = coon.getInputStream();
                            byte[] b = new byte[1024*512];
                            int len = 0;
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            while ((len = in.read()) > -1) {
                                baos.write(b,0,len);
                            }
                            String msg = baos.toString();
                            Log.e("TAG",msg);
                            //
                            try {
                                JSONObject obj = new JSONObject(msg);
                                int status = obj.getInt("status");
                                
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }
}


















