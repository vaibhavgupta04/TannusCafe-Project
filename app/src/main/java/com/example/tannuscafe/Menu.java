package com.example.tannuscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Coff(View view) {
        Intent intent = new Intent(this, Coffee.class);
        startActivity(intent);
    }

    public void Mock(View view) {
        Intent intent = new Intent(this, Beverages.class);
        startActivity(intent);
    }

    public void Star(View view) {
        Intent intent = new Intent(this, Starters.class);
        startActivity(intent);
    }

    public void Bred(View view) {
        Intent intent = new Intent(this, Breads.class);
        startActivity(intent);
    }
}