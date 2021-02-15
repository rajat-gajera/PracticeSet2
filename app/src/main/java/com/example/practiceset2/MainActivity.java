package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0,scoreB=0;

    public void AddThreeForTeamA(View view)
    {
        score+=3;
        displayForTeamA(score);
    }
    public void AddTwoForTeamA(View view)
    {
        score+=2;
        displayForTeamA(score);
    }
    public void AddOneForTeamA(View view)
    {
        score+=1;
        displayForTeamA(score);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void AddThreeForTeamB(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void AddTwoForTeamB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void AddOneForTeamB(View view)
    {
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void Reset(View view) {
        score=0;
        scoreB=0;
        displayForTeamA(score);
        displayForTeamB(scoreB);

    }
}