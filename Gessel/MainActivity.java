package com.example.mpr;    //nama package

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import library

public class MainActivity extends AppCompatActivity { //deklarasi class, yang mana mewarisi sifat2 AppCompatActivity

    Button tombol;      //  }
    EditText edit;      //   } deklarasi variabel
    String st;          //  }

    @Override   //agar subclass dapat mengimplementasikan method dari superclass
    protected void onCreate(Bundle savedInstanceState) { //pembuatan method oncreate, method pertama yang diakses ketika apk dijalankan
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol =findViewById(R.id.button);
        edit=findViewById(R.id.inputText);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                st=edit.getText().toString();
                i.putExtra("nilai", st);
                startActivity(i);
                finish();

            }
        });
    }

    public void clearMessage (View view){
        EditText editText = (EditText) findViewById(R.id.inputText);
        editText.getText().clear();
    }

}