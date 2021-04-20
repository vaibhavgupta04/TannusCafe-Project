package com.example.tannuscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Starters extends AppCompatActivity {

    int burger=0;
    int bgrrate=70;
    int noodle=0;
    int noorate=90;
    int wrap=0;
    int wraprate=70;
    int french=0;
    int frenrate=80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
    }

    public void incBgr(View view) {
        burger++;
        displayBgr(burger);
    }

    public void decBgr(View view) {
        burger--;
        displayBgr(burger);
    }

    public void incNood(View view) {
        noodle++;
        displayNood(noodle);
    }

    public void decNood(View view) {
        noodle--;
        displayNood(noodle);
    }

    public void incWrap(View view) {
        wrap++;
        displayWrap(wrap);
    }

    public void decWrap(View view) {
        wrap--;
        displayWrap(wrap);
    }

    public void incFre(View view) {
        french++;
        displayFren(french);
    }

    public void decFrench(View view) {
        french--;
        displayFren(french);
    }
    private void displayBgr(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.bgrNo);
        quantityTextView.setText("" + number);
    }
    private void displayNood(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.noodNo);
        quantityTextView.setText("" + number);
    }
    private void displayWrap(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.wpNo);
        quantityTextView.setText("" + number);
    }
    private void displayFren(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.ffNo);
        quantityTextView.setText("" + number);
    }
}