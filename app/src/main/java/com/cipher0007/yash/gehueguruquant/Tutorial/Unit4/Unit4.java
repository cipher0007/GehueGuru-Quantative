package com.cipher0007.yash.gehueguruquant.Tutorial.Unit4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Lesson1.Lesson41;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Lesson2.Lesson2;

public class Unit4 extends AppCompatActivity {
    private CardView lesson1,lesson2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4);
        lesson1=findViewById(R.id.lesson41);
        lesson2=findViewById(R.id.lesson42);

        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson1=new Intent(Unit4.this,Lesson41.class);
                startActivity(lesson1);
            }
        });
       lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson2=new Intent(Unit4.this, Lesson2.class);
                startActivity(lesson2);
            }
        });

    }
}
