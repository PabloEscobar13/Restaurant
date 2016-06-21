package com.pablo.com.info;

import java.util.ArrayList;

/**
 * Created by Pablo on 17.06.2016.
 */
public class Dish {

    private String name;
    private double price;

    private static String offers[] = {"lunch", "drink"};
    private static String[] cuisines = new String[]{"Polish", "Mexican", "Italian"};

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static String[] getCuisines() {
        return cuisines;
    }

    /**
     * Getters and setters
     **/

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static String[] getOffers() {
        return offers;
    }
    /**
     * Get list of string meals
     **/
    public static String getStringList(String[] list) {
        String stuff = "";
        for (String s : list) {
            stuff += "/" + s;
        }
        return stuff;
    }
    /**
     * Get choose list of dishes
     **/
    public static String getDishList(Dish[] list) {
        String dishList = "";
        for (Dish d : list) {
            dishList += "/" + d.getName();
        }
        return dishList;
    }
    public static String getDishList(ArrayList<Dish> list) {
        Dish[] array = list.toArray(new Dish[list.size()]);
        return getDishList(array);
    }
    /**
     * Order question
     **/
    public static void askForOrder(Dish[] list) {
        System.out.println("We can offer you: ");
        System.out.println(getDishList(list));
    }

}

