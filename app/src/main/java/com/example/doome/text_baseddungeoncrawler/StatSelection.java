package com.example.doome.text_baseddungeoncrawler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat_selection);
        configureNextButton();
    }
    private void configureNextButton() {
        Button progressButton = (Button) findViewById(R.id.StatNextButton);
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatSelection.this, Gameplay.class));
            }
        });
        Button progressButton1 = (Button) findViewById(R.id.StatBackButton);
        progressButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatSelection.this, HowToPlayTwo.class));
            }
        });
    }
}
