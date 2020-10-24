package com.example.tes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button tombol;
    EditText edit;
     String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol =findViewById(R.id.button);
        edit=findViewById(R.id.edittext);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,aktivitaskedua.class);
                st=edit.getText().toString();
                i.putExtra("nilai", st);
                startActivity(i);
                finish();

            }
        });
    }
}