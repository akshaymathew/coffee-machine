package org.example.models;

import java.util.Map;

abstract class BeverageDecorator implements Beverage {
    protected final Beverage decoratedBeverage;
    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    public int getCost() {
        return decoratedBeverage.getCost();
    }

    public Map<Ingredient, Integer> getIngredients() {
        return decoratedBeverage.getIngredients();
    }
    public void setIngredient(){return;}
}
