package com.cipher0007.yash.gehueguruquant.Tutorial.Unit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson1.Lesson1;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson2;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson3;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson4;

public class Unit1 extends AppCompatActivity {
private CardView lesson1,lesson2,lesson3,lesson4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);
        lesson1=findViewById(R.id.lesson1);
        lesson2=findViewById(R.id.lesson2);
        lesson3=findViewById(R.id.lesson3);
        lesson4=findViewById(R.id.lesson4);

        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson1=new Intent(Unit1.this, Lesson1.class);
                startActivity(lesson1);
            }
        });
        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson2=new Intent(Unit1.this, Lesson2.class);
                startActivity(lesson2);
            }
        });
        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson3=new Intent(Unit1.this, Lesson3.class);
                startActivity(lesson3);
            }
        });
        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson4=new Intent(Unit1.this, Lesson4.class);
                startActivity(lesson4);
            }
        });
    }
}

