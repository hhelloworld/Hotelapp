package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import static android.widget.Toast.LENGTH_LONG;

public class register extends Activity {

    EditText daftarnama, daftaremail, daftarpass, repass, daftartelepon;
    Button enter, back;
    DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db = new DB(this);

            daftarnama = (EditText)findViewById(R.id.daftar_fullname);
            daftaremail = (EditText)findViewById(R.id.daftar_email);
            daftarpass = (EditText)findViewById(R.id.daftar_password);
            repass = (EditText)findViewById(R.id.daftar_repassword);
            daftartelepon = (EditText) findViewById(R.id.daftar_telepon);
            enter = (Button)findViewById(R.id.daftar_button);
        back = (Button)findViewById(R.id.daftar_buttonback);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = daftarnama.getText().toString();
                String email = daftaremail.getText().toString();
                String password = daftarpass.getText().toString();
                String repassword = repass.getText().toString();
                String telepon = daftartelepon.getText().toString();

                if (!nama.contains("") || !email.contains("@") || !email.contains(".com") ||
                        password.isEmpty() || repassword.isEmpty() || !telepon.contains("+62")) {

                Toast.makeText(getApplicationContext(), "Field tidak boleh kosong/ invalid", LENGTH_LONG).show(); }

                else{
                    if (password.equals(repassword)) {
                        Boolean checkEmail = db.checkEmail(email);
                        if (checkEmail == true) {
                            Boolean insert = db.insertAcc(nama, email, password, telepon);
                            if (insert == true) {
                                Toast.makeText(getApplicationContext(), "Daftar berhasil !", LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), " Email sudah digunakan!", LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, login.class);
                register.this.startActivity(i);
            }
        });
    }
}
