package com.example.tes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class aktivitaskedua extends AppCompatActivity {
    TextView text;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitaskedua);
        text=findViewById(R.id.textView);
        st=getIntent().getExtras().getString("nilai");
        text.setText(st);
    }
}