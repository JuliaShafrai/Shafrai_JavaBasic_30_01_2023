package com.hillel.shafrai.homeworks.hw13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;
    int countOfMeat;

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Ingredients: " + bun + ", " + meat + ", " + cheese + ", " + greenery + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenery){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Ingredients: " + bun + ", " + meat + ", " + cheese + ", " + greenery);
    }

    public Burger(String bun, String meat, int countOfMeat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        this.countOfMeat = countOfMeat;
        System.out.println("Ingredients: " + bun + ", " + countOfMeat + " " + meat + ", " + cheese + ", " + greenery + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, int countOfMeat, String cheese, String greenery){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.countOfMeat = countOfMeat;
        System.out.println("Ingredients: " + bun + ", " + countOfMeat + " " + meat + ", " + cheese + ", " + greenery);
    }

}


