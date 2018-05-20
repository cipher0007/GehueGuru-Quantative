package com.cipher0007.yash.gehueguruquant.Exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;

import com.cipher0007.yash.gehueguruquant.R;

public class Activity7_5 extends AppCompatActivity {
    private CardView solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity7_5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Activity 7.5");
        setSupportActionBar(toolbar);

}}
