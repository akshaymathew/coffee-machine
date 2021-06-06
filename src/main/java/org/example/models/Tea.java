package org.example.models;

import java.util.HashMap;
import java.util.Map;

public class Tea implements Beverage {
    private Map<Ingredient,Integer> ingredient;
    private int cost;
    public Tea()
    {
        this.ingredient = new HashMap<>();
        setIngredients();

        this.cost = 30;
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
    public void setIngredients() {
        ingredient.put(Ingredient.HOT_WATER,200);
        ingredient.put(Ingredient.HOT_MILK,100);
        ingredient.put(Ingredient.SUGAR_SYRUP,10);
        ingredient.put(Ingredient.TEA_LEAVES_SYRUP,30);
    }
    public String getName() { return "Simple Tea";}

}
