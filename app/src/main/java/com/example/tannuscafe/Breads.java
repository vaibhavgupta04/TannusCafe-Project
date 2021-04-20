package com.example.tannuscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Breads extends AppCompatActivity {
    int bd1=0;
    int bd1rate=30;
    int bd2=0;
    int bd2rate=40;
    int bd3=0;
    int bd3rate=50;
    int bd4=0;
    int bd4rate=90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breads);
    }

    public void incbd1(View view) {
        bd1++;
        displaybd1(bd1);
    }

    public void decbd1(View view) {
        bd1--;
        displaybd1(bd1);
    }

    public void incbd2(View view) {
        bd2++;
        displaybd2(bd2);
    }

    public void decbd2(View view) {
        bd2--;
        displaybd2(bd2);
    }

    public void incbd3(View view) {
        bd3++;
        displaybd3(bd3);
    }

    public void decbd3(View view) {
        bd3--;
        displaybd3(bd3);
    }

    public void incbd4(View view) {
        bd4++;
        displaybd4(bd4);
    }

    public void decbd4(View view) {
        bd4--;
        displaybd4(bd4);
    }

    private void displaybd1(int bd1) {
        TextView quantityTextView = (TextView) findViewById(R.id.bd1No);
        quantityTextView.setText("" + bd1);
    }

    private void displaybd2(int bd2) {
        TextView quantityTextView = (TextView) findViewById(R.id.bd2No);
        quantityTextView.setText("" + bd2);
    }

    private void displaybd3(int bd3) {
        TextView quantityTextView = (TextView) findViewById(R.id.bd3No);
        quantityTextView.setText("" + bd3);
    }

    private void displaybd4(int bd4) {
        TextView quantityTextView = (TextView) findViewById(R.id.bd4No);
        quantityTextView.setText("" + bd4);
    }
}