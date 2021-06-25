package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.prefs.Preferences;

public class login extends Activity {

    EditText loginEmail, loginPass;
    Button login;

    DB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DB(this);



        loginEmail = (EditText) findViewById(R.id.login_email);
        loginPass = (EditText) findViewById(R.id.login_pass);
        login = (Button) findViewById(R.id.login_button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = loginEmail.getText().toString();
                String password = loginPass.getText().toString();
                Boolean account = db.account(email, password);

                    if (account==true){
                        Toast.makeText(getApplicationContext(), "Email/ Password salah!", Toast.LENGTH_LONG).show();}
                    else {

                        Toast.makeText(getApplicationContext(), "Selamat datang", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(login.this, HomePage.class);
                        login.this.startActivity(i);
                        finish();
                    }

                }

        });
    }




    public void reg(View view) {
        Intent i = new Intent(login.this, register.class);
        login.this.startActivity(i);
    }
}


