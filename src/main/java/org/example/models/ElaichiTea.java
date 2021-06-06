package org.example.models;

import java.util.Map;

public class ElaichiTea extends BeverageDecorator {
    private Map<Ingredient,Integer> ingredient;
    public ElaichiTea(Beverage beverage)
    {
        super(beverage);
        ingredient = super.getIngredients();
        setIngredients();
    }
    public int getCost() {
        return super.getCost()+20;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredient;
    }
    public void setIngredients()
    {
        ingredient.put(Ingredient.ELAICHI_SYRUP,10);
    }
    public String getName() { return "Elaichi Tea";}
}
