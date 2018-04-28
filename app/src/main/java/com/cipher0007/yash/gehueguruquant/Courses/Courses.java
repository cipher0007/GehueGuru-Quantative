package com.cipher0007.yash.gehueguruquant.Courses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.Copyright;
import com.cipher0007.yash.gehueguruquant.Exercise.Exercises;
import com.cipher0007.yash.gehueguruquant.R;

public class Courses extends AppCompatActivity {
    private CardView tutorial, example, exercise, copyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        tutorial = findViewById(R.id.tutorial);
        example = findViewById(R.id.example);
        exercise = findViewById(R.id.exercises);
        copyright = findViewById(R.id.copyright);
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tutorial = new Intent(Courses.this, Tutorial.class);
                startActivity(tutorial);
            }
        });

        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent example = new Intent(Courses.this, Example.class);
                startActivity(example);
            }
        });

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(Courses.this, Exercises.class);
                startActivity(exercise);
            }
        });
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(Courses.this, Copyright.class);
                startActivity(exercise);
            }
        });


    }
}
