package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent logini = getIntent();
        Bundle b = logini.getExtras();
        if(b!=null){
            String uname=b.getString("u");
            String password=b.getString("p");
//            Toast toast= Toast.makeText(getApplicationContext(),uname+password,Toast.LENGTH_SHORT);
//            toast.show();



        }

    }
}
