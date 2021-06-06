package org.example;

import org.example.models.Beverage;
import org.example.models.Ingredient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoffeeMachineApplication {
    Map<Ingredient,Integer> hm = new HashMap<>();
    int n;
    CoffeeMachineApplication(int n)
    {
        System.out.println("Coffee machine has started with "+ n + " outlets");
        this.n = n;
    }
    /*
    Get a list of ingredient present in the application currently
     */
    public Map<Ingredient,Integer> getIngredient() {return hm;}
    /*
    A public method to refill or to put ingredients for the first time
     */
    public void putIngredient(Ingredient ingredient, int quantity)
    {
        hm.put(ingredient,quantity);
    }

    /*
    A public method to serve a given beverage given as input  to the person
     */
    public void getBeverage(Beverage beverage) throws InterruptedException
    {
        Map<Ingredient,Integer> beverageIngredients = beverage.getIngredients();
        synchronized (this) {
            if(!checkDispatch(beverage))
                System.out.println(beverage.getName() +" is not present due to lack of ingredients");
            else {
                    Iterator it = beverageIngredients.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry mp = (Map.Entry) it.next();
                        Ingredient ig = (Ingredient) mp.getKey();
                        int quantity = (int) mp.getValue();
                        int changedQuantity = hm.get(ig) - quantity;
                        /*
                        Alert notification for ingredient quantity going below a threshold
                         */
                        if (changedQuantity < 20)
                            System.out.println("Refill needed for " + ig);
                        hm.put(ig, hm.get(ig) - quantity);
                    }
                    System.out.println(beverage.getName() +" dispatched and currently amount avaialable is ");
                    System.out.println(hm);
                }
        }
    }
    /*
    A private method to check if the coffee machine has enough ingredient to the sertve the selected beverage
     */
    private boolean checkDispatch(Beverage beverage)
    {
        Iterator it = beverage.getIngredients().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            Ingredient ig = (Ingredient) mp.getKey();
            int quantity = (int)mp.getValue();
            if (!hm.containsKey(ig) || hm.get(ig) < quantity)
                return false;
        }
        return true;
    }
}
