package com.rainaini.pokemoncard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.rainaini.pokemoncard.adapter.ListPokeCardAdapter;
import com.rainaini.pokemoncard.data.PokeCard;
import com.rainaini.pokemoncard.data.PokeCardData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<PokeCard> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PokeCardData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListPokeCardAdapter listPokeCardAdapter = new ListPokeCardAdapter(this);
        listPokeCardAdapter.setListPokeCard(list);
        rvCategory.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvCategory.setAdapter(listPokeCardAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedPresident(list.get(position));
            }
        });
    }

    private void showSelectedPresident(PokeCard pokeCard){
        Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, pokeCard.getName());
        moveIntent.putExtra(DetailActivity.EXTRA_TYPES, pokeCard.getTypes());
        moveIntent.putExtra(DetailActivity.EXTRA_HP, pokeCard.getHp());
        moveIntent.putExtra(DetailActivity.EXTRA_PHOTO, pokeCard.getPhoto());
        moveIntent.putExtra(DetailActivity.EXTRA_PLAY, pokeCard.getPlay());
        moveIntent.putExtra(DetailActivity.EXTRA_DAMAGE, pokeCard.getDamage());
        startActivity(moveIntent);
    }
}
