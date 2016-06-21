package com.pablo.com.info.Food;

import java.util.ArrayList;

/**
 * Created by Pablo on 20.06.2016.
 */
public class Dessert extends Dish {

    private static ArrayList<Dish> desertList = new ArrayList<>(3);

    public Dessert(String name, double price) {
        super(name, price);
        desertList.add(this);
    }

    public static ArrayList<Dish> getDesertList() {
        return desertList;
    }
}
