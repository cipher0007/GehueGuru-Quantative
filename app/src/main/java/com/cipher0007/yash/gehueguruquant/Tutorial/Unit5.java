package com.cipher0007.yash.gehueguruquant.Tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Lesson1.Lesson41;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Lesson2.Lesson2;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Unit4;

public class Unit5 extends AppCompatActivity {
private CardView lesson1,lesson2,lesson3,lesson4,lesson5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5);
        lesson1=findViewById(R.id.lesson51);
        lesson2=findViewById(R.id.lesson52);
        lesson3=findViewById(R.id.lesson53);
        lesson4=findViewById(R.id.lesson54);
        lesson5=findViewById(R.id.lesson55);

        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson1=new Intent(Unit5.this,Lesson41.class);
                startActivity(lesson1);
            }
        });
        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson2=new Intent(Unit5.this, Lesson2.class);
                startActivity(lesson2);
            }
        });
        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson1=new Intent(Unit5.this,Lesson41.class);
                startActivity(lesson1);
            }
        });
        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson2=new Intent(Unit5.this, Lesson2.class);
                startActivity(lesson2);
            }
        });
        lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson2=new Intent(Unit5.this, Lesson2.class);
                startActivity(lesson2);
            }
        });
    }
}
