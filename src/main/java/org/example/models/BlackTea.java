package org.example.models;

import java.util.Map;

public class BlackTea extends BeverageDecorator {
    private Map<Ingredient,Integer> ingredient;
    public BlackTea(Beverage beverage)
    {
        super(beverage);
        ingredient = super.getIngredients();
        setIngredients();
    }
    public int getCost() {
        return super.getCost()+15;
    }

    public Map<Ingredient, Integer> getIngredients() {

        return ingredient;
    }
    public void setIngredients()
    {
        ingredient.put(Ingredient.HOT_WATER,300);
        ingredient.put(Ingredient.SUGAR_SYRUP,50);
        ingredient.remove(Ingredient.HOT_MILK);
        ingredient.put(Ingredient.GINGER_SYRUP,30);
    }
    public String getName() { return "Black Tea";}
}
