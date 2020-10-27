package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;//library import yang dipakai di activity

public class MoveActivity extends AppCompatActivity {//sama seperti yang halaman pertama yaitu turunan dari appcompactActivity




    @Override
    protected void onCreate(Bundle savedInstanceState) {//merupakan sebuah method callback
        super.onCreate(savedInstanceState);//merupakan method callback untuk memberikan akses ke subclass
        setContentView(R.layout.activity_move);//

     TextView tampilin = findViewById(R.id.textt);//menghubungkan textview yang sudah di buat,berfungsi untuk menampilkan inputan

     String name = getIntent().getStringExtra("nilai");//menerima hasil inputan dari mainActivity
     tampilin.setText(name);//memanggil fungsi name

    }


}