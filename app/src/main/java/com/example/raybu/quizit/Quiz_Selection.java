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

public class Quiz_Selection extends AppCompatActivity {

    private Button startQuiz;
    private EditText quizCode;
    private EditText fName;
    private EditText lName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__selection);

        startQuiz = (Button) findViewById(R.id.LogIn);
        quizCode = (EditText) findViewById(R.id.quizCode);
        fName = (EditText) findViewById(R.id.FName);
        lName = (EditText) findViewById(R.id.LName);



        TextView appTittle = (TextView) findViewById(R.id.title);
        Typeface pacifico = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        appTittle.setTypeface(pacifico);

        startQuiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final String codeForQuiz = quizCode.getText().toString();
                String firstName = fName.getText().toString();
                String lastName = lName.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(Quiz_Selection.this);
                builder.setMessage("You Are about to take quiz " + codeForQuiz + ".");
                builder.setNegativeButton("Start", null);
                builder.show();
}
});
   }
}