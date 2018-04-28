package com.cipher0007.yash.gehueguruquant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.AboutUs.AboutCourseInstructor;
import com.cipher0007.yash.gehueguruquant.AboutUs.AboutDeveloper;
import com.cipher0007.yash.gehueguruquant.AboutUs.AboutUniversity;

public class About extends AppCompatActivity {
CardView auniversity,ainstructor,adeveloper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        auniversity=findViewById(R.id.aboutuniversity);
        ainstructor=findViewById(R.id.aboutinstructor);
        adeveloper=findViewById(R.id.aboutdeveloper);

        auniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni=new Intent(About.this, AboutUniversity.class);
                startActivity(uni);
            }
        });
        ainstructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ins=new Intent(About.this, AboutCourseInstructor.class);
                startActivity(ins);
            }
        });
        adeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deve=new Intent(About.this, AboutDeveloper.class);
                startActivity(deve);
            }
        });
    }
}
