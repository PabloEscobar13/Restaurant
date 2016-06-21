package com.pablo.com.info.Drink;

import com.pablo.com.info.Dish;

import java.util.ArrayList;

/**
 * Created by Pablo on 17.06.2016.
 */
public class Drink extends Dish {

    private static ArrayList<Dish> drinkList = new ArrayList<>(3);

    public Drink(String name, double price) {
        super(name, price);
        drinkList.add(this);
    }

    public static ArrayList<Dish> getDrinkList() {
        return drinkList;
    }
}
