package org.example.models;

import java.util.Map;

public class GingerTea extends BeverageDecorator {
    private Map<Ingredient,Integer> ingredient;
    public GingerTea(Beverage beverage)
    {
        super(beverage);
        ingredient = super.getIngredients();
        setIngredients();
    }
    public int getCost() {
        return super.getCost()+10;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredient;
    }
    public void setIngredients()
    {
        ingredient.put(Ingredient.GINGER_SYRUP,10);
    }
    public String getName() { return "Ginger Tea";}
}
