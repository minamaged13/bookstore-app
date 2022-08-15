package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new account button
        final Button NewAccount =(Button) findViewById(R.id.NewaccountButton);
        NewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,NewAccount.class);
                startActivity(i);
            }
        }
        );
        //submit button
        final Button Submit =(Button) findViewById(R.id.SubmitButton);

        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText login_username=(EditText)findViewById(R.id.login_Username);
                EditText login_password=(EditText)findViewById(R.id.login_password);
                if(!(login_username.getText().toString().equals(""))&&!(login_password.getText().toString().equals(""))){
                     //put data validation and database here


                    Intent i =new Intent(MainActivity.this,Library.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"username or password are empty",Toast.LENGTH_LONG).show();
                }

            }
        }
        );
    }
}
