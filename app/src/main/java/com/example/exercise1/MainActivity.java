package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button btnLogin, btnRegister;
    EditText ednama, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnRegister);

        ednama = findViewById(R.id.edNama);

        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = ednama.getText().toString();

                password = edpassword.getText().toString();

                String nama = "Erwinsyah";

                String password = "123";

                if (nama.equals(nama) && password.equals(password)) {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Login Sukses",
                            Toast.LENGTH_LONG);

                    toast.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());

                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), Hasil.class);

                    i.putExtras(b);

                    startActivity(i);
                } else {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);

                    toast.show();
                }
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Pendaftaran.class);
                startActivity(i);
            }
        });

    }
}