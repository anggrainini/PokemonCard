package com.rainaini.pokemoncard.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rainaini.pokemoncard.R;
import com.rainaini.pokemoncard.data.PokeCard;

import java.util.ArrayList;

public class ListPokeCardAdapter extends RecyclerView.Adapter<ListPokeCardAdapter.CategoryViewHolder> {
    private Context context;

    public ArrayList<PokeCard> getListPokeCard() {
        return listPokeCard;
    }

    public void setListPokeCard(ArrayList<PokeCard> listPokeCard) {
        this.listPokeCard = listPokeCard;
    }

    private ArrayList<PokeCard> listPokeCard;

    public ListPokeCardAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        holder.pokeName.setText(getListPokeCard().get(position).getName());
        holder.pokeTypes.setText(getListPokeCard().get(position).getTypes());

        Glide.with(context)
                .load(getListPokeCard().get(position).getPhoto())
                .apply(new RequestOptions().placeholder(R.drawable.logo).override(200, 200))
                .into(holder.pokePhoto);
    }

    @Override
    public int getItemCount() {
        return getListPokeCard().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        //types, name, hp, photo

        TextView pokeTypes;
        TextView pokeName;
        ImageView pokePhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            pokeTypes = itemView.findViewById(R.id.pokeType);
            pokeName = itemView.findViewById(R.id.pokeName);
            pokePhoto = itemView.findViewById(R.id.pokeCard);
        }
    }
}
