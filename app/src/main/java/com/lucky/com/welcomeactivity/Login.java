package com.lucky.com.welcomeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button logintbtn;
    private EditText emailET,passwordET;
    private TextView registerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logintbtn=findViewById(R.id.loginbtn);
        emailET=findViewById(R.id.emaildET);
        passwordET=findViewById(R.id.passwordET);
        registerTV=findViewById(R.id.registetTV);

///////////////////////////////////////////////////////////////////////////////////////////////////
        logintbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String email=emailET.getText().toString();
                String password=passwordET.getText().toString();

                isEmpty(email,password);

                Intent home=new Intent(Login.this,Home.class);
                startActivity(home);

            }
        });


///////////////////////////////////////////////////////////////////////////////////////////////////

        registerTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent=new Intent(Login.this,Register.class);
                startActivity(registerIntent);
            }
        });




    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    private void isEmpty(String email,String password){

        if(email.length()==0){
            emailET.setError("enter email address");
        }

        if(password.length()==0){
            passwordET.setError("enter password");
        }


    }


/////////////////////////////////////////////////////////////////////////////////////////////////////


}
