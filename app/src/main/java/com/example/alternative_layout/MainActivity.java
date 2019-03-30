package com.example.alternative_layout;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alternativelayout);

    }
//    @Override
//    public void onConfigurationChanged (Configuration newConfig){
//        super.onConfigurationChanged(newConfig);
//        setContentView(R.layout.alternativelayout);     //注意，这里删除了init()，否则又初始化了，状态就丢失
//    }
}
