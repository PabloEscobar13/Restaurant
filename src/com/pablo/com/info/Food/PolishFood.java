package com.pablo.com.info.Food;

import java.util.ArrayList;

/**
 * Created by Pablo on 18.06.2016.
 */
public class PolishFood extends Dish{

    private static ArrayList<Dish> polishFood = new ArrayList<>(3);

    public PolishFood(String name, double price) {
        super(name, price);
        polishFood.add(this);
    }
    public static ArrayList<Dish> getPolishFood() {
        return polishFood;
    }
}
