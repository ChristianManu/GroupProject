package com.example.raybu.quizit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button teacherScreen;
    private Button studentScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teacherScreen = (Button) findViewById(R.id.teacher);
        studentScreen = (Button) findViewById(R.id.student);

        TextView appTittle = (TextView) findViewById(R.id.title);
        Typeface pacifico = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        appTittle.setTypeface(pacifico);

        teacherScreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LogIn.class);
                MainActivity.this.startActivity(intent);
            }
        });

        studentScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LogIn2.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}