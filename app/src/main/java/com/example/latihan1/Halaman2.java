package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {
TextView halaman2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        halaman2 = findViewById(R.id.tvHalaman2);
        String dataHalaman1 = getIntent().getStringExtra("JNE");
        halaman2.setText(dataHalaman1);

    }
}
