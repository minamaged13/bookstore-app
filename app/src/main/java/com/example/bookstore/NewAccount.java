package com.example.bookstore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button newacc_submit=(Button)findViewById(R.id.NewaccSubmitBtn);
        newacc_submit.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                     EditText newacc_name=(EditText)findViewById(R.id.newacc_name);
                     EditText newacc_age=(EditText)findViewById(R.id.newacc_age);
                     EditText newacc_username=(EditText)findViewById(R.id.newacc_username);
                     EditText newacc_password=(EditText)findViewById(R.id.newacc_password);
                     EditText newacc_confirmPassword=(EditText)findViewById(R.id.newacc_confirmPassword);

                     if(!(newacc_username.getText().toString().equals(""))&&!(newacc_password.getText().toString().equals(""))&&!(newacc_confirmPassword.getText().toString().equals(""))&&!(newacc_age.getText().toString().equals(""))&&!(newacc_name.getText().toString().equals(""))){
                        if(newacc_password.getText().toString().equals(newacc_confirmPassword.getText().toString())){
                            //password = confirm password
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"password and confirm password are not the same",Toast.LENGTH_LONG).show();
                        }
                         //put data validation and database here

                     }
                     else{
                         Toast.makeText(getApplicationContext(),"please fill the empty fields",Toast.LENGTH_LONG).show();
                     }

                     }
        }
        );
    }

}
