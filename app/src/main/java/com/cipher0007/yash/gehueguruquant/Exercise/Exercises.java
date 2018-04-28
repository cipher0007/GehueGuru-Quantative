package com.cipher0007.yash.gehueguruquant.Exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Exercises extends AppCompatActivity {
private CardView activity1lesson1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
activity1lesson1=findViewById(R.id.activity1lesson1);
activity1lesson1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent acti1=new Intent(Exercises.this, ExerciseLesson1.class);
        startActivity(acti1);
    }
});
    }
}
