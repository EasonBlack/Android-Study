package com.example.eason.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_detail);

        // 从Intent获取数据
        int imageId = getIntent().getIntExtra("person_image", 0);
        String desc = getIntent().getStringExtra("person_desc");

        // 获取特定的视图
        ImageView imageView = (ImageView) findViewById(R.id.person_large_imageView);
        TextView textView = (TextView) findViewById(R.id.person_desc_textView);

        // 根据数据设置视图展现
        imageView.setImageResource(imageId);
        textView.setText(desc);
    }
}
