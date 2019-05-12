package com.e.test;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText e;
    EditText p;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e=findViewById(R.id.eeditText);
        p=findViewById(R.id.peditText);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("knr3337254@gmail.com") && p.getText().toString().equals("3337254")){
                Intent intent=new Intent(LoginActivity.this,Showadd.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "Login successful....", Toast.LENGTH_SHORT).show();
            }
            else {
                    Toast.makeText( LoginActivity.this, "Username and Password doesn't match", Toast.LENGTH_SHORT ).show();
                }

            }
        });
    }

}
