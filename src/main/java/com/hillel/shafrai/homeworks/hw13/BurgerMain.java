package com.hillel.shafrai.homeworks.hw13;

public class BurgerMain {
    public static void main(String[] args) {

        new Burger("bun with sesame", "beef", "cheddar cheese", "cabbage", "mayonnaise");
        new Burger("bun with sesame", "beef", "cheddar cheese", "cabbage");
        new Burger("bun with sesame", "beef", 2, "cheddar cheese", "cabbage");
        new Burger("bun with sesame", "beef", 2, "cheddar cheese", "cabbage", "mayonnaise");
    }
}
