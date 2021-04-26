package com.example.tugasempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1 ,editText2; //Deklarasi object dari class EdiText
    String text1 ,text2; //Deklarasi object string
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                if ((text1.contains("Username")) && ((text2.contains("Password")))) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else if ((text1.matches("") || text2.matches("")))
              /*
              Atau jika input text 1 dan text 2 kosong
               */ {
                    //Maka akan menampilkan pesan text toast
                    Toast.makeText(getApplicationContext(), "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

                } else {
                    //jika kedua kondisi diatas tidak memenuhi

                    Toast.makeText(getApplicationContext(), "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}