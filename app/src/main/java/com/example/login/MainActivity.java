package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String uname="";
    String password="";
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.username);
        editText2 = findViewById(R.id.password_id);
    }

    public void login(View view) {
        uname = editText1.getText().toString();
        password = editText2.getText().toString();
        Intent intent = new Intent(this,login.class);
        intent.putExtra("p",password);
        intent.putExtra("u",uname);
        startActivity(intent);
    }
}
