package org.example;

import org.example.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TwoOutletsTest {
    @Test
    public void serveTwoBeverages() throws InterruptedException{
        System.out.printf("------------------  %n %n");
        System.out.println("Test Case 1");
        System.out.printf("------------------  %n %n");
        int numberOfThreads = 2;
        ExecutorService service = Executors.newFixedThreadPool(2);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        CoffeeMachineApplication cma = new CoffeeMachineApplication(2);
        cma.putIngredient(Ingredient.HOT_WATER,500);
        cma.putIngredient(Ingredient.HOT_MILK,500);
        cma.putIngredient(Ingredient.GINGER_SYRUP,100);
        cma.putIngredient(Ingredient.SUGAR_SYRUP,100);
        cma.putIngredient(Ingredient.GREEN_MIXTURE,50);
        cma.putIngredient(Ingredient.TEA_LEAVES_SYRUP,100);
        Beverage blackTea = new BlackTea(new Tea());
        Beverage tea = new Tea();
        Beverage gingerTea = new GingerTea(new Tea());
        service.submit(() -> {
            try {
                cma.getBeverage(blackTea);
                cma.getBeverage(tea);
                cma.getBeverage(gingerTea);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // Handle exception
            }
            //latch.countDown();
        });
        //latch.await();
        service.shutdown();
    }
}
