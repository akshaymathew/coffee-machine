package org.example;

import org.example.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class FourOutletsTest {
    @Test
    public void serveFourBeverages() throws InterruptedException{
        System.out.printf("------------------  %n %n");
        System.out.println("Test Case 3");
        System.out.printf("------------------  %n %n");
        int numberOfThreads = 4;
        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        CoffeeMachineApplication cma = new CoffeeMachineApplication(numberOfThreads);
        cma.putIngredient(Ingredient.HOT_WATER,500);
        cma.putIngredient(Ingredient.HOT_MILK,500);
        cma.putIngredient(Ingredient.GINGER_SYRUP,100);
        cma.putIngredient(Ingredient.SUGAR_SYRUP,100);
        cma.putIngredient(Ingredient.TEA_LEAVES_SYRUP,100);
        cma.putIngredient(Ingredient.GREEN_MIXTURE,50);
        Beverage blackTea = new BlackTea(new Tea());
        Beverage tea = new Tea();
        Beverage gingerTea = new GingerTea(new Tea());
        Beverage hotMilk = new HotMilk();
        Beverage greenTea = new GreenTea(new Tea());
        service.submit(() -> {
            try {
                cma.getBeverage(blackTea);
                cma.getBeverage(tea);
                cma.getBeverage(gingerTea);
                cma.getBeverage(hotMilk);
                cma.getBeverage(greenTea);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // Handle exception
            }
        });
        service.shutdown();
    }
}
