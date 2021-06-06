package org.example.models;

import java.util.HashMap;
import java.util.Map;

public class HotWater implements Beverage {
    private Map<Ingredient,Integer> ingredient;
    private int cost;
    HotWater()
    {
        this.ingredient = new HashMap<>();
        setIngredients();
        this.cost = 10;
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
        ingredient.put(Ingredient.HOT_WATER,50);
    }
    public String getName() { return "Hot Water";}
}
