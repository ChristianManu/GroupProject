package com.example.raybu.quizit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn2 extends AppCompatActivity {
    private Button signUpPage;
    private Button goToNextPage;
    private EditText editEmail;
    private EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        signUpPage = (Button) findViewById(R.id.signUp);
        goToNextPage = (Button)findViewById(R.id.LogIn);

        editEmail = (EditText) findViewById(R.id.email);
        editPassword = (EditText) findViewById(R.id.password);

        TextView appTittle = (TextView) findViewById(R.id.title);
        Typeface pacifico = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        appTittle.setTypeface(pacifico);

        signUpPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogIn2.this, SignUp2.class);
                LogIn2.this.startActivity(intent);
            }
        });

        goToNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = editEmail.getText().toString();
                String userPassword = editPassword.getText().toString();

                //need to validate if user exists
                if(isEmpty(userEmail) || isEmpty(userPassword))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LogIn2.this);
                    builder.setMessage("Please Enter a valid Email/Password");
                    builder.setNegativeButton("Retry", null);
                    builder.create();
                    builder.show();
                }
                else
                {

                    Intent intent = new Intent(LogIn2.this, student.class);
                    LogIn2.this.startActivity(intent);
                }
            }
        });


    }

    public Boolean isEmpty(String str)
    {
        if(str.length() == 0 || str == null || str.equals(""))
        {
            return true;
        }
        else
            return false;
    }
}