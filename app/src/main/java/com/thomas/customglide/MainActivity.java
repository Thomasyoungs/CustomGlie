package com.thomas.customglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
String url = "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3327248454,849738544&fm=26&gp=0.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.iv_image1);
        ImageView imageView2 = findViewById(R.id.iv_image2);
        ImageView imageView3 = findViewById(R.id.iv_image3);

        Glide.with(this).load(url).loadding(R.mipmap.ic_launcher).into(imageView1);
        Glide.with(this).load(url).loadding(R.mipmap.ic_launcher).into(imageView2);
        Glide.with(this).load(url).loadding(R.mipmap.ic_launcher).into(imageView3);

    }
}
