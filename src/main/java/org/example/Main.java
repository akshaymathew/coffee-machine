package org.example;

import org.example.models.*;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args)  throws InterruptedException {
	// write your code here

        int numberOfThreads = 3;
        //ExecutorService service = Executors.newFixedThreadPool(10);
        //        System.out.printf("------------------  %n %n");
//        System.out.println("Test Case 1");
//        System.out.printf("------------------  %n %n");
//        CoffeeMachineApplication cma = new CoffeeMachineApplication(3);
//        cma.putIngredient(Ingredient.HOT_WATER,500);
//        cma.putIngredient(Ingredient.HOT_MILK,500);
//        cma.putIngredient(Ingredient.GINGER_SYRUP,100);
//        cma.putIngredient(Ingredient.SUGAR_SYRUP,100);
//        cma.putIngredient(Ingredient.TEA_LEAVES_SYRUP,100);
//        cma.putIngredient(Ingredient.GREEN_MIXTURE,50);
//        System.out.println("Original quantity of ingredients is "+ cma.getIngredient());
//        Beverage blackTea = new BlackTea(new Tea());
//        Beverage tea = new Tea();
//        Beverage gingerTea = new GingerTea(new Tea());
//        Beverage hotMilk = new HotMilk();
//        Beverage greenTea = new GreenTea(new Tea());
//        Thread t1 = new Thread(new Runnable() {
//            public void run()
//            {
//                try {
//                    cma.getBeverage(blackTea);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            public void run()
//            {
//                try {
//                    cma.getBeverage(tea);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread t3 = new Thread(new Runnable() {
//            public void run()
//            {
//                try {
//                    cma.getBeverage(gingerTea);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread t4 = new Thread(new Runnable() {
//            public void run()
//            {
//                try {
//                    cma.getBeverage(hotMilk);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thread t5 = new Thread(new Runnable() {
//            public void run()
//            {
//                try {
//                    cma.getBeverage(greenTea);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        System.out.println(Thread.activeCount());
    }
}
