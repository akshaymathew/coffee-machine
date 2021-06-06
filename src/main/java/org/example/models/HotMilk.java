package org.example.models;

import java.util.HashMap;
import java.util.Map;

public class HotMilk implements Beverage {
    private Map<Ingredient,Integer> ingredient;
    private int cost;
    public HotMilk()
    {
        this.ingredient = new HashMap<>();
        setIngredients();
        this.cost = 20;
    }
    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public Map<Ingredient, Integer> getIngredients() {
        return this.ingredient;
    }
    @Override
    public void setIngredients()
    {
        ingredient.put(Ingredient.HOT_MILK,50);
    }
    @Override
    public String getName() { return "Hot Milk";}
}
