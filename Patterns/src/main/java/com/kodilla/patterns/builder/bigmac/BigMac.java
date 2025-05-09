package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac  {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private  String bun;
        private  int burgers;
        private  String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if(!bun.equals("sezam") && !bun.equals("zwykła")){
                throw new IllegalStateException("Bułka może być z sezamem lub zwykła");
            }
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            if (burgers < 1) {
                throw new IllegalStateException("Burger musi składać się z minimum 1 kotleta");
            }
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if (!List.of("standard","1000 wysp", "sos barbecue").contains(sauce)){
                throw new IllegalStateException("Wybrano zły rodzaj sosu");
            }
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            if(!List.of("sałata", "cebula", "bekon", "ogórek", "papryczki chilli", "pieczarki", "krewetki", "ser").contains(ingredient)){
                throw new IllegalStateException("Nie ma takiego dodatku");
            }
            this.ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
