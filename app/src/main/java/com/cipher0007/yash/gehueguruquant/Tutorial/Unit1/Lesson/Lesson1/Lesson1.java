package com.cipher0007.yash.gehueguruquant.Tutorial.Unit1.Lesson.Lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.cipher0007.yash.gehueguruquant.R;

public class Lesson1 extends AppCompatActivity {
private CardView intro,counting,divi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
        intro=findViewById(R.id.introduction);
        counting=findViewById(R.id.counting);
        divi=findViewById(R.id.divisibility);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introduc=new Intent(Lesson1.this,IntroductionLesson1.class);
                startActivity(introduc);
            }
        });
        counting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coun=new Intent(Lesson1.this,Countinglesson1.class);
                startActivity(coun);
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent divid=new Intent(Lesson1.this,Divisibilityrule.class);
                startActivity(divid);
            }
        });

    }
}
