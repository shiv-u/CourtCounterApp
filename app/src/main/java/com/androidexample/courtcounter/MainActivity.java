package com.androidexample.courtcounter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scorea = 0, scoreb = 0;

    /**
     * Displays the given score for Team A.
     */

    RelativeLayout parent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = findViewById(R.id.parent);
        displaya(0);
    }

    public void scoreSixa(View view) {
        scorea = scorea + 6;
        displaya(scorea);


    }

    public void scoreFoura(View view) {
        scorea = scorea + 4;
        displaya(scorea);

    }

    public void scoreOnea(View view) {
        scorea = scorea + 1;
        displaya(scorea);

    }

    public void displaya(int number) {
        TextView countViewera = (TextView) findViewById(R.id.team_a_score);
        parent.setBackgroundColor(getResources().getColor(R.color.RCB));
        countViewera.setText("" + number);
    }

    public void scoreSixb(View view) {
        scoreb += 6;

        displayb(scoreb);


    }

    public void scoreFourb(View view) {
        scoreb += 4;
        displayb(scoreb);

    }

    public void scoreOneb(View view) {
        scoreb += 1;
        displayb(scoreb);

    }

    public void displayb(int number) {
        TextView countViewerb = (TextView) findViewById(R.id.team_b_score);
        parent.setBackgroundColor(getResources().getColor(R.color.CSK));
        countViewerb.setText("" + number);
    }

    public void reset(View view) {
        scorea = 0;
        scoreb = 0;
        displaya(0);
        displayb(0);
    }
}