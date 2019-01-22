package com.rainaini.pokemoncard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button openCard = findViewById(R.id.openCard);
        openCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent moveIntent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });
    }
}
