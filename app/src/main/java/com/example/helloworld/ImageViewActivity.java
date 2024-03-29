package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        mIv4 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png").into(mIv4);
    }
}
