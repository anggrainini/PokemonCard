package com.rainaini.pokemoncard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity  extends AppCompatActivity {
    public static String EXTRA_TYPES ="extra_types";
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_HP ="extra_hp";
    public static String EXTRA_PHOTO ="extra_photo";
    public static String EXTRA_PLAY ="extra_play";
    public static String EXTRA_DAMAGE = "extra_damage";

    private TextView pokeName, pokeTypes, pokeHP, pokePlay, pokeDamage;
    private ImageView pokePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        pokeName = findViewById(R.id.pokeName);
        pokePhoto= findViewById(R.id.pokeCard);
        pokeTypes = findViewById(R.id.pokeType);
        pokeDamage = findViewById(R.id.pokeDamage);
        pokePlay = findViewById(R.id.pokeHowToPlay);
        pokeHP = findViewById(R.id.pokeHP);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String type = getIntent().getStringExtra(EXTRA_TYPES);
        String damage = getIntent().getStringExtra(EXTRA_DAMAGE);
        String play = getIntent().getStringExtra(EXTRA_PLAY);
        String hp = getIntent().getStringExtra(EXTRA_HP);

        pokeName.setText(name);
        pokeTypes.setText(type);
        pokeDamage.setText(damage);
        pokePlay.setText(play);
        pokeHP.setText(hp);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_PHOTO))
                .into(pokePhoto);

    }
}

