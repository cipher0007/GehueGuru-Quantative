package com.cipher0007.yash.gehueguruquant.Exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Exercises extends AppCompatActivity {
    private CardView activity1lesson1, activity1_2, activity1_3, activity1_4, activity2_1, activity2_2, activity2_3, activity2_4, activity2_5, activity3_1,activity3_2,activity3_3,activity3_4,activity3_5,activity3_6,activity3_7,activity3_8,activity3_9,activity3_10,activity3_11,activity3_12,
            activity4_1,activity4_2,activity4_3,activity4_4,activity4_5,activity4_6,activity4_7,
            activity5_1,activity5_2,activity5_3,activity5_4,activity5_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        activity1lesson1 = findViewById(R.id.activity1lesson1);
        activity1_2 = findViewById(R.id.activity1lesson2);
        activity1_3 = findViewById(R.id.activity1lesson3);
        activity1_4 = findViewById(R.id.activity1_4);
        activity2_1 = findViewById(R.id.activity2_1);
        activity2_2 = findViewById(R.id.activity2_2);
        activity2_3 = findViewById(R.id.activity2_3);
        activity2_4 = findViewById(R.id.activity2_4);
        activity2_5 = findViewById(R.id.activity2_5);
        activity3_1 = findViewById(R.id.activity3_1);
        activity3_2 = findViewById(R.id.activity3_2);
        activity3_3 = findViewById(R.id.activity3_3);
        activity3_4 = findViewById(R.id.activity3_4);
        activity3_5 = findViewById(R.id.activity3_5);
        activity3_6 = findViewById(R.id.activity3_6);
        activity3_7 = findViewById(R.id.activity3_7);
        activity3_8 = findViewById(R.id.activity3_8);
        activity3_9 = findViewById(R.id.activity3_9);
        activity3_10 = findViewById(R.id.activity3_10);
        activity3_11 = findViewById(R.id.activity3_11);
        activity3_12 = findViewById(R.id.activity3_12);
        activity4_1 = findViewById(R.id.activity4_1);
        activity4_2 = findViewById(R.id.activity4_2);
        activity4_3 = findViewById(R.id.activity4_3);
        activity4_4 = findViewById(R.id.activity4_4);
        activity4_5 = findViewById(R.id.activity4_5);
        activity4_6 = findViewById(R.id.activity4_6);
        activity4_7 = findViewById(R.id.activity4_7);
        activity5_1 = findViewById(R.id.activity5_1);
        activity5_2 = findViewById(R.id.activity5_2);
        activity5_3 = findViewById(R.id.activity5_3);
        activity5_4 = findViewById(R.id.activity5_4);
        activity5_5 = findViewById(R.id.activity5_5);








        activity1lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti1 = new Intent(Exercises.this, ExerciseLesson1.class);
                startActivity(acti1);
            }
        });

        activity1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti1_2 = new Intent(Exercises.this, Activity1_2.class);
                startActivity(acti1_2);
            }
        });
        activity1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti1_2 = new Intent(Exercises.this, Activity1_3.class);
                startActivity(acti1_2);
            }
        });
        activity1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti1_4 = new Intent(Exercises.this, Activity1_4.class);
                startActivity(acti1_4);
            }
        });
        activity2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti2_1 = new Intent(Exercises.this, Activity2_1.class);
                startActivity(acti2_1);
            }
        });
        activity2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti2_2 = new Intent(Exercises.this, Activity2_2.class);
                startActivity(acti2_2);
            }
        });
        activity2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti2_3 = new Intent(Exercises.this, Activity2_3.class);
                startActivity(acti2_3);
            }
        });
        activity2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti2_4 = new Intent(Exercises.this, Activity2_4.class);
                startActivity(acti2_4);
            }
        });
        activity2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti2_5 = new Intent(Exercises.this, Activity2_5.class);
                startActivity(acti2_5);
            }
        });
        activity3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_1 = new Intent(Exercises.this, Activity3_1.class);
                startActivity(acti3_1);
            }
        });
        activity3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_2 = new Intent(Exercises.this, Activity3_2.class);
                startActivity(acti3_2);
            }
        });
        activity3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_3 = new Intent(Exercises.this, Activity3_3.class);
                startActivity(acti3_3);
            }
        });
        activity3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_4 = new Intent(Exercises.this, Activity3_4.class);
                startActivity(acti3_4);
            }
        });
        activity3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_5 = new Intent(Exercises.this, Activity3_5.class);
                startActivity(acti3_5);
            }
        });
        activity3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_6 = new Intent(Exercises.this, Activity3_6.class);
                startActivity(acti3_6);
            }
        });
        activity3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_7 = new Intent(Exercises.this, Activity3_7.class);
                startActivity(acti3_7);
            }
        });
        activity3_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_8 = new Intent(Exercises.this, Activity3_8.class);
                startActivity(acti3_8);
            }
        });
        activity3_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_9 = new Intent(Exercises.this, Activity3_9.class);
                startActivity(acti3_9);
            }
        });
        activity3_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_10 = new Intent(Exercises.this, Activity3_10.class);
                startActivity(acti3_10);
            }
        });
        activity3_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_11 = new Intent(Exercises.this, Activity3_11.class);
                startActivity(acti3_11);
            }
        });
        activity3_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti3_12 = new Intent(Exercises.this, Activity3_12.class);
                startActivity(acti3_12);
            }
        });

        activity4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_1 = new Intent(Exercises.this, Activity4_1.class);
                startActivity(acti4_1);
            }
        });
        activity4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_2 = new Intent(Exercises.this, Activity4_2.class);
                startActivity(acti4_2);
            }
        });
        activity4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_3 = new Intent(Exercises.this, Activity4_3.class);
                startActivity(acti4_3);
            }
        });
        activity4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_4 = new Intent(Exercises.this, Activity4_4.class);
                startActivity(acti4_4);
            }
        });
        activity4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_5 = new Intent(Exercises.this, Activity4_5.class);
                startActivity(acti4_5);
            }
        });
        activity4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_6 = new Intent(Exercises.this, Activity4_6.class);
                startActivity(acti4_6);
            }
        });
        activity4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti4_7 = new Intent(Exercises.this, Activity4_7.class);
                startActivity(acti4_7);
            }
        });

        activity5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti5_1 = new Intent(Exercises.this, Activity5_1.class);
                startActivity(acti5_1);
            }
        });
        activity5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti5_2 = new Intent(Exercises.this, Activity5_2.class);
                startActivity(acti5_2);
            }
        });
        activity5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti5_3 = new Intent(Exercises.this, Activity5_3.class);
                startActivity(acti5_3);
            }
        });
        activity5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti5_4= new Intent(Exercises.this, Activity5_4.class);
                startActivity(acti5_4);
            }
        });
        activity5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acti5_5 = new Intent(Exercises.this, Activity5_5.class);
                startActivity(acti5_5);
            }
        });

    }
}
