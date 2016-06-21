package com.pablo.com.info.Food;

import java.util.ArrayList;

/**
 * Created by Pablo on 18.06.2016.
 */
public class MexicanFood extends Dish{

    private static ArrayList<Dish> mexicanFood = new ArrayList<>();

    public MexicanFood(String name, double price) {
        super(name, price);
        mexicanFood.add(this);
    }
//    public static Dish[] getMexicanDish() {
//        Dish[] array = mexicanFood.toArray(new Dish[mexicanFood.size()]);
//        return array;
//    }

    public static ArrayList<Dish> getMexicanFood() {
        return mexicanFood;
    }
}
