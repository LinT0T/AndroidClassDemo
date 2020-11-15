package com.lint0t.androidclassdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    private final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

//        Log.d(TAG,"onCreate ---> 创建时调用");

//        putExtra传递数据
        Intent i = getIntent();
        String data = i.getStringExtra("data");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "2", Toast.LENGTH_LONG).show();
//        startActivityForResult()获取返回数据
//        Intent i = new Intent();
//        i.putExtra("result","哈哈");
//        setResult(3, i);
//        finish();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart ---> 重启时调用");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart ---> 即将可见不可交互时调用");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume ---> 可见可交互时调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause ---> 即将暂停时调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop ---> 即将停止不可见时调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy ---> 即将销毁时调用");
    }
}