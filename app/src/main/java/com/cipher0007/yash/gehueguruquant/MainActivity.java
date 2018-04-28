package com.cipher0007.yash.gehueguruquant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.cipher0007.yash.gehueguruquant.Courses.Courses;

public class MainActivity extends AppCompatActivity {
private RelativeLayout about,courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about=findViewById(R.id.about);
        courses=findViewById(R.id.courses);


        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent courses =new Intent(MainActivity.this,Courses.class);
                startActivity(courses);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about =new Intent(MainActivity.this,About.class);
                startActivity(about);
            }
        });


    }
}
