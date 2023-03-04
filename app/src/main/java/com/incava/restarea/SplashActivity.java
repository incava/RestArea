package com.incava.restarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SplashActivity extends AppCompatActivity {

    String[] commentAry;
    TextView tvComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        commentAry = getResources().getStringArray(R.array.commentAry);
        int idx = new Random().nextInt(3);
        tvComment = findViewById(R.id.tv_comment);
        tvComment.setText(commentAry[idx]);
    }
}