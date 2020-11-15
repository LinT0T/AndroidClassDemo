package com.lint0t.androidclassdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         通过findViewById，在activity中获取到我们在布局中设置的button控件,id是我们自己起的btn_test
         */
        Button mButton = findViewById(R.id.btn_test);
          /*
         给我们获取到的mButton添加点击事件监听
         */
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  /*
                  显式Intent，通过Intent可以设置要跳转到的activity
                   */
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data", "taotaojiejie is beautiful");
                startActivity(intent);

//                putExtra传递数据


//                startActivityForResult()获取返回数据
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivityForResult(intent, 1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //此处可以根据两个Code进行判断，本页面和结果页面跳过来的值
        if (requestCode == 1 && resultCode == 3) {
            String result = data.getStringExtra("result");
            TextView mTextView = findViewById(R.id.tv_main);
            mTextView.setText(result);
        }
    }

}