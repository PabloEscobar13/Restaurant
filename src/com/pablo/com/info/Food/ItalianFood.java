package com.pablo.com.info.Food;

import java.util.ArrayList;

/**
 * Created by Pablo on 18.06.2016.
 */
public class ItalianFood extends Dish{

    private static ArrayList<Dish> italianFood = new ArrayList<>(3);

    public ItalianFood(String name, double price) {
        super(name, price);
        italianFood.add(this);
    }
//    public static Dish[] getItalianDish() {
//        Dish[] array = italianFood.toArray(new Dish[italianFood.size()]);
//        return (Dish[])italianFood.toArray();
//    }

    public static ArrayList<Dish> getItalianFood() {
        return italianFood;
    }
}
