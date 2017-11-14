package com.example.divan.sigmawayquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class AnaltyicsResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analtyics_result);
        Button rtry=(Button)findViewById(R.id.retry);
        Button qu=(Button)findViewById(R.id.quit);


        rtry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnaltyicsResultActivity.this,AnalyticsActivity.class));
            }
        });

        qu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //get rating bar object
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        bar.setNumStars(5);
        bar.setStepSize(0.5f);
        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        bar.setRating(score);
        bar.getNumStars();
        bar.getRating();
        switch (score)
        {
            case 1: t.setText("Keep Trying.");
                break;
            case 2: t.setText("Keep trying.");
                break;
            case 3:t.setText("Good Keep trying.");
                break;
            case 4:t.setText("You're Awesome. On the right track mate.");
                break;
            case 5:t.setText("Wow that's something... Excellent. Bravo");
                break;
        }
    }
}
