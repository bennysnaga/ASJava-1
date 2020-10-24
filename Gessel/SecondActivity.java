package com.example.mpr;    //nama package

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import libary


public class SecondActivity extends AppCompatActivity { //deklarasi class, yang mana mewarisi sifat2 AppCompatActivity

    TextView text;  //   } deklarasi variabel
    String st;      //   } deklarasi variabel

    @Override   //agar subclass dapat mengimplementasikan method dari superclass
    protected void onCreate(Bundle savedInstanceState) { //pembuatan method oncreate, method pertama yang diakses ketika apk dijalankan
        super.onCreate(savedInstanceState); //memanggil method di superclass dan InstanceState yang tersimpan dari sebuah activity
        setContentView(R.layout.activity_second);   //mengatur layout mana yang dipakai
        text=findViewById(R.id.textView);   //pemanggilan berdasarkan id
        st=getIntent().getExtras().getString("nilai");  //mengembalikan inten dan ekstra di activity yang dideklarasi sebelumnya
        text.setText(st);   //input nilai yang didapat dari activity sebelumnya ke dalam text
    }
}
