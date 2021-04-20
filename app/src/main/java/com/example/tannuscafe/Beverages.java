package com.example.tannuscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Beverages extends AppCompatActivity {

    int blue=0;
    int bluerate=130;
    int yell=0;
    int yellrate=140;
    int org=0;
    int orgrate=120;
    int purp=0;
    int purprate=140;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
    }

    public void incBlue(View view) {
        blue++;
        displayBlue(blue);
    }

    public void decBlue(View view) {
        blue--;
        displayBlue(blue);
    }


    public void incYell(View view) {
        yell++;
        displayYell(yell);
    }

    public void decYell(View view) {
        yell--;
        displayYell(yell);
    }

    public void incOrg(View view) {
        org++;
        displayOrg(org);
    }

    public void decOrg(View view) {
        org--;
        displayOrg(org);
    }

    public void incPurp(View view) {
        purp++;
        displayPurp(purp);
    }

    public void decPurp(View view) {
        purp--;
        displayPurp(purp);
    }

    private void displayBlue(int blue) {
        TextView quantityTextView = (TextView) findViewById(R.id.blueNo);
        quantityTextView.setText("" + blue);
    }

    private void displayYell(int yell) {
        TextView quantityTextView = (TextView) findViewById(R.id.yellNo);
        quantityTextView.setText("" + yell);
    }

    private void displayOrg(int org) {
        TextView quantityTextView = (TextView) findViewById(R.id.orgNo);
        quantityTextView.setText("" + org);
    }

    private void displayPurp(int purp) {
        TextView quantityTextView = (TextView) findViewById(R.id.purpNo);
        quantityTextView.setText("" + purp);
    }
}