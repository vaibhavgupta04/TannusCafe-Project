package com.example.tannuscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Coffee extends AppCompatActivity {
    int capp=0;
    int capprate=110;
    int amer=0;
    int amerrate=120;
    int esp=0;
    int esprate=90;
    int frap=0;
    int fraprate=130;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
    }

    public void incCapp(View view) {
        capp++;
        displayCapp(capp);
    }

    public void decCapp(View view) {
        capp--;
        displayCapp(capp);
    }


    public void incAmer(View view) {
        amer++;
        displayAmer(amer);
    }

    public void decAmer(View view) {
        amer--;
        displayAmer(amer);
    }

    public void incEsp(View view) {
        esp++;
        displayEsp(esp);
    }

    public void decEsp(View view) {
        esp--;
        displayEsp(esp);
    }

    public void incFrap(View view) {
        frap++;
        displayFrap(frap);
    }

    public void decFrap(View view) {
        frap--;
        displayFrap(frap);
    }

    private void displayCapp(int capp) {
        TextView quantityTextView = (TextView) findViewById(R.id.cappNo);
        quantityTextView.setText("" + capp);
    }

    private void displayFrap(int frap) {
        TextView quantityTextView = (TextView) findViewById(R.id.frapNo);
        quantityTextView.setText("" + frap);
    }

    private void displayEsp(int esp) {
        TextView quantityTextView = (TextView) findViewById(R.id.espNo);
        quantityTextView.setText("" + esp);
    }

    private void displayAmer(int amer) {
        TextView quantityTextView = (TextView) findViewById(R.id.amerNo);
        quantityTextView.setText("" + amer);
    }
}