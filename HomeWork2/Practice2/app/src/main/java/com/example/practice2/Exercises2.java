package com.example.practice2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        findViewById(R.id.tv_center).setOnClickListener(this);
    }

    public int getAllChildViewCount(View view) {
        //todo 补全你的代码
        int viewCount = 0;
        if (null == view) {
            return 0;
        }
        if (view instanceof ViewGroup) {
            //遍历ViewGroup,是子view加1，是ViewGroup递归调用
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                View child = ((ViewGroup) view).getChildAt(i);
                if (child instanceof ViewGroup) {
                    viewCount += getAllChildViewCount(((ViewGroup) view).getChildAt(i));
                }
                else {
                    viewCount++;
                }
            }
        }
        else {
            viewCount++;
        }
        return viewCount;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tv_center) {
            int num = getAllChildViewCount((View)v.getParent());
            TextView text = findViewById(R.id.tv_center);
            String t = "    " + num + "    ";
            text.setText(t);
        }
    }
}
