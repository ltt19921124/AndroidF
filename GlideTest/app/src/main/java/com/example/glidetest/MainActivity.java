package com.example.glidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
    }
    public void loadImage(View view) {
        String url = "http://tupian.sioe.cn/b/bing-home-image/pic/20140901.jpg";
        Glide.with(this).load(url).into(imageView);
    }
}
