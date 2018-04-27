package com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Lesson1 extends AppCompatActivity {
private CardView intro,counting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
        intro=findViewById(R.id.introduction);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introduc=new Intent(Lesson1.this,IntroductionLesson1.class);
                startActivity(introduc);
            }
        });


    }
}
