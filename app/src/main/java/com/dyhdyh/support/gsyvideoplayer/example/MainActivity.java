package com.dyhdyh.support.gsyvideoplayer.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StandardGSYVideoPlayer player = findViewById(R.id.video);
        player.setUp("http://image.g2u.livearts.cn/1510296065136_cache_1510296032021.mp4",true,"呵呵");
    }
}
