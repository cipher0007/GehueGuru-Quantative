package com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class IntroductionLesson1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_lesson1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("1.1.1 Introduction");
        setSupportActionBar(toolbar);


    }
}
