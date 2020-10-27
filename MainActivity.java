    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;//import disini merupakan kumpulan library yang kita gunakan untuk menjalankan aplikasi.

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{//class yang merupakan  mainactiviy turunan dari AppCompactActivity

        public EditText inputxt;//merupakan deklarasi EditText atau sebuah textbox untuk menerima inputan teks
        String st;//deklarasi variabel string

    @Override
    protected void onCreate(Bundle savedInstanceState) {//merupakan method yang menjadi permulaan siklus activity dalam aplikasi ,dia membuat apa-apa saja yang sudah kita koding kan.
        super.onCreate(savedInstanceState);//merupakan method callback untuk memberikan akses ke subclass
        setContentView(R.layout.activity_main);//menghubungkan dengan activity_main.xml agar menampilkan interface

        inputxt =findViewById(R.id.inputtext);//mendeklarasikan EditText yang sudah dibuat di activity_main.xml kedalam sini


        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        //mendeklarasikan button yang id nya sudah dibuat di activity_main.xml,button ini berguna untuk mengirim data ke page selanjutnya
        Button btnReset = findViewById(R.id.btn_reset);//mendeklarasikan button yang berfungsi untuk mereset editText
        btnMoveActivity.setOnClickListener((View.OnClickListener) this);//agar button itu bisa di terhubung



    }
    @Override
        public void onClick(View v){//sebuah class yg berguna ketika button di click
            switch(v.getId()){//switch statement yang berguna untuk ketika banyak button dipakai

                case R.id.btn_move_activity://case button yang mengirim data ke halaman selanjutnya
                    Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);//intent berguna untuk menghubungkan halaman ini dengan activity di halam kedua
                    st=inputxt.getText().toString();//mengambil hasil inputan
                    moveIntent.putExtra("nilai",st);//mengirimkan hasil inputan ke halaman kedua
                    startActivity(moveIntent);//memulai mengirim
                    break;


            }

    }

        public void clear(View view) {//class yang berguna untuk tombol reset
        inputxt.setText(" ");//membuat ketika button reset ditekan maka teksnya akan terhapus
        }
    }