package com.rainaini.pokemoncard.data;

import java.util.ArrayList;

public class PokeCardData {
    public static String[][] data = new String[][]{
            //types, pokeName, pokeHP, pokecard, play, damage
            {"Grass", "Caterpie", "40", "https://images.pokemontcg.io/base1/45.png", "Flip a coin. If heads, the Defending Pokémon is now Paralyzed", "10"},
            {"Fire", "Charmander", "50", "https://images.pokemontcg.io/base1/46.png", "Discard 1 Energy card attached to Charmander in order to use this attack.","30"},
            {"Fighting", "Diglett", "30", "https://images.pokemontcg.io/base1/47.png", "Do Nothing", "10"},
            {"Psychic", "Drowzee", "50", "https://images.pokemontcg.io/base1/49.png",  "Flip a coin. If heads, the Defending Pokémon is now Confused.", "10" },
            {"Grass","Koffing", "50", "https://images.pokemontcg.io/base1/51.png",  "Flip a coin. If heads, the Defending Pokémon is now Poisoned; if tails, it is now Confused.", "0"},
            {"Fire","Ninetales", "80", "https://images.pokemontcg.io/base1/12.png", "If your opponent has any Benched Pokémon, choose 1 of them and switch it with the Defending Pokémon.", "0"},
            {"Grass","Venusaur", "100", "https://images.pokemontcg.io/base1/15.png", "As often as you like during your turn (before your attack), you may take 1 Grass Energy card attached to 1 of your Pokémon and attach it to a different one. This power can't be used if Venusaur is Asleep, Confused, or Paralyzed.", "0" },
            {"Fire", "Charizard", "120", "https://images.pokemontcg.io/base1/4.png", "Discard 2 Energy cards attached to Charizard in order to use this attack", "100"},
            {"Water", "Gyarados", "100", "https://images.pokemontcg.io/base1/6.png", "Flip a coin. If heads, Defending Pokémon is now Paralyzed.","40"}
    };

    public static ArrayList<PokeCard> getListData(){
        PokeCard pokeCard;
        ArrayList<PokeCard> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            pokeCard = new PokeCard();
            pokeCard.setTypes(data[i][0]);
            pokeCard.setName(data[i][1]);
            pokeCard.setHp(data[i][2]);
            pokeCard.setPhoto(data[i][3]);
            pokeCard.setPlay(data[i][4]);
            pokeCard.setDamage(data[i][5]);
            list.add(pokeCard);
        }

        return list;
    }
}
