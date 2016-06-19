package com.pablo;

import com.pablo.com.info.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dish dish1 = new PolishFood("Pierogi", 10.60);
        Dish dish2 = new PolishFood("Bigos", 11.20);
        Dish dish3 = new PolishFood("Schabowy", 16.00);
        Dish dish4 = new ItalianFood("Pizza", 12.50);
        Dish dish5 = new ItalianFood("Spaghetti", 13.90);
        Dish dish6 = new ItalianFood("Lazagne", 17.30);
        Dish dish7 = new MexicanFood("Buritto", 13.10);
        Dish dish8 = new MexicanFood("Tortilla", 11.70);
        Dish dish9 = new MexicanFood("Tortilla1", 14.10);
        Dish dish10 = new Drink("Mohiato", 11.00);
        Dish dish11 = new Drink("SexOnTheBeach", 14.60);
        Dish dish12 = new Drink("Vodka", 8.70);

        boolean somethingElse = false;
        ArrayList<Dish> orderList = new ArrayList<>(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello can I take your order?");

        do {
            System.out.println("Would you like a lunch or a drink?");
            System.out.println(Dish.getStringList(Dish.getOffers()));
            String meal = scan.next();
            switch (meal) {

                /**Client order a lunch BEGIN**/
                case "lunch": {
                    System.out.println("What cuisine do you prefer?");
                    System.out.println(Dish.getStringList(Dish.getCuisines()));
                    meal = scan.next();
                    switch (meal) {
                        case "Polish": {
                            Dish.askForOrder(Dish.dishToArray(PolishFood.getPolishFood()));
                            String order = scan.next();
                            Order.dishOrder(order, Dish.dishToArray(PolishFood.getPolishFood()));
                            break;
                        }
                        case "Mexico": {
                            Dish.askForOrder(Dish.dishToArray(MexicanFood.getMexicanFood()));
                            String order = scan.next();
                            Order.dishOrder(order, Dish.dishToArray(MexicanFood.getMexicanFood()));
                            break;
                        }
                        case "Italian": {
                            Dish.askForOrder(Dish.dishToArray(ItalianFood.getItalianFood()));
                            String order = scan.next();
                            Order.dishOrder(order, Dish.dishToArray(ItalianFood.getItalianFood()));
                            break;
                        }
                    }
                }/**Client order a lunch END**/

                /**Client order a drink BEGIN**/
                case "drink": {
                    System.out.println("What drink do you prefer?");
                }
                /**Client order a drink END**/
            }
            int check = -1;
            System.out.println("Anything else? ");
            do {
                System.out.println("yes/no");
                String yesNo;
                yesNo = scan.next();
                if (yesNo.equals("yes")) {
                    somethingElse = true;
                    check = 1;

                } else if (yesNo.equals("no")) {
                    somethingElse = false;
                    check = 1;
                } else {
                    System.out.println("Sorry sir?");
                }
            } while (check == -1);
        } while (somethingElse);

        System.out.println(Arrays.toString(orderList.toArray()));

    }
}

