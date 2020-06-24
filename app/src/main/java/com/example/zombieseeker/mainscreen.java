package com.example.zombieseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        setupHelpBtn();
    }

    public static Intent skipAnimation(Context context){
        return new Intent(context, mainscreen.class);
    }

    public static Intent returnHelpActivity(Context c){
        return new Intent(c, mainscreen.class);
    }

    private void setupHelpBtn() {
        Button helpActivityBtn = (Button) findViewById(R.id.helpBtn);
        helpActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = helpactivity.helpActivity(mainscreen.this);
                startActivity(i);
            }
        });
    }
}