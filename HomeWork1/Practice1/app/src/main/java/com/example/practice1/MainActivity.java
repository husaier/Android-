package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        final EditText et1 = findViewById(R.id.editText);
        final CheckBox cb1 = findViewById(R.id.checkBox);
        final TextView tv1 = findViewById(R.id.textView);

        Log.d(TAG, "MainActivity");

        btn1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                Log.d(TAG, "确定按钮被点击");
                String name = et1.getText().toString();
                boolean isChinese = cb1.isChecked();
                if(isChinese) {
                    if (name.equals("Input your name")) {
                        Log.d(TAG, "中文，未输入姓名");
                        tv1.setText("多么精彩的一个世界！");
                    }
                    else {
                        Log.d(TAG, "中文，已输入姓名");
                        tv1.setText("很高兴见到你, ".concat(name));
                    }
                }
                else {
                    if (name.equals("Input your name")){
                        Log.d(TAG, "英文，未输入姓名");
                        tv1.setText("What a wonderful world!");
                    }
                    else{
                        Log.d(TAG, "英文，已输入姓名");
                        tv1.setText("Nice to meet you, ".concat(name));
                    }
                }
            }
        });

    }
}

