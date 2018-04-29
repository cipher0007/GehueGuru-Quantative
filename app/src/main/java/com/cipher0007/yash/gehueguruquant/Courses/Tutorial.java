package com.cipher0007.yash.gehueguruquant.Courses;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Unit1;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit2;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit3;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit4;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit5;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit6;
import com.cipher0007.yash.gehueguruquant.Tutorial.Unit7;

public class Tutorial extends AppCompatActivity {
private CardView unit1,unit2,unit3,unit4,unit5,unit6,unit7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        unit1=findViewById(R.id.unit1);
        unit2=findViewById(R.id.unit2);
        unit3=findViewById(R.id.unit3);
        unit4=findViewById(R.id.unit4);
        unit5=findViewById(R.id.unit5);
        unit6=findViewById(R.id.unit6);
        unit7=findViewById(R.id.unit7);

        unit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent unit1=new Intent(Tutorial.this,Unit1.class);
               startActivity(unit1);
            }
        });
        unit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(Tutorial.this,Unit2.class);
                startActivity(unit2);
            }
        });
        unit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(Tutorial.this,Unit3.class);
                startActivity(unit3);
            }
        });
        unit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(Tutorial.this,Unit4.class);
                startActivity(unit4);
            }
        });
        unit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(Tutorial.this,Unit5.class);
                startActivity(unit5);
            }
        });
        unit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(Tutorial.this,Unit6.class);
                startActivity(unit6);
            }
        });
        unit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit7=new Intent(Tutorial.this,Unit7.class);
                startActivity(unit7);
            }
        });
    }

}
