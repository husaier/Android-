package com.example.practice2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ChatRoom extends AppCompatActivity {

    private static final String TAG = "chatroom";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        TextView header = findViewById(R.id.tv_with_name);
        header.setText("消息");

        TextView indexDisplay = findViewById(R.id.tv_content_info);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("data");
        indexDisplay.setText(msg);
    }
}
