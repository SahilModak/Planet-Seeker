package com.example.zombieseeker.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zombieseeker.R;

public class helpactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpactivity);
        setupreturnHelpBtn();
    }

    public static Intent helpActivity(Context c){
        return new Intent(c, helpactivity.class);
    }

    private void setupreturnHelpBtn() {     // setting up button to return to mainscreen from the HElp button
        Button helpActivityBtn = (Button) findViewById(R.id.helpbutton);
        helpActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = mainscreen.returnHelpActivity(helpactivity.this);
                startActivity(i);
            }
        });
    }
}