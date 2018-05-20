package com.cipher0007.yash.gehueguruquant.Tutorial.Unit4.Lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Lesson2 extends AppCompatActivity {
 private CardView intro4,bas,rlt,avg,relative,train,boat,circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson14);
        intro4=findViewById(R.id.introo);
        bas=findViewById(R.id.bas);
        rlt=findViewById(R.id.rln);
        avg=findViewById(R.id.avg);
        relative=findViewById(R.id.relative);
        train=findViewById(R.id.train);
        boat=findViewById(R.id.boat);
        circle=findViewById(R.id.circle);
        intro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bas=new Intent(Lesson2.this,Intro42.class);
                startActivity(bas);
            }
        });
        bas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alt=new Intent(Lesson2.this,Basic.class);
                startActivity(alt);
            }
        });
        rlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent con=new Intent(Lesson2.this,Relation.class);
                startActivity(con);
            }
        });
        avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pro=new Intent(Lesson2.this,Average.class);
                startActivity(pro);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prob=new Intent(Lesson2.this,Relative.class);
                startActivity(prob);
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pip=new Intent(Lesson2.this,Train.class);
                startActivity(pip);
            }
        });
        boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pip=new Intent(Lesson2.this,Boat.class);
                startActivity(pip);
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pip=new Intent(Lesson2.this,Circle.class);
                startActivity(pip);
            }
        });

    }
}
