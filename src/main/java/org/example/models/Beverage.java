package org.example.models;

import java.util.Map;

public interface Beverage {
    public int getCost();
    public Map<Ingredient, Integer> getIngredients();
    public void setIngredients();
    public String getName();
}
