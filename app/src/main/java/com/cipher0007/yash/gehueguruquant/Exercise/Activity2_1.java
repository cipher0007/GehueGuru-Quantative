package com.cipher0007.yash.gehueguruquant.Exercise;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Activity2_1 extends AppCompatActivity {
    private CardView solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Activity 2.1");
        setSupportActionBar(toolbar);

}}
