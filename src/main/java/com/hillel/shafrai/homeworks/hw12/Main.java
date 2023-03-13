package com.hillel.shafrai.homeworks.hw12;

public class Main {
    public static void main (String[] args){
        String str1 = personInfo("Mary", "Yrchenko", "Poland", "+48455688608");
        System.out.println(str1);
        System.out.println(personInfo("Angelina", "Nosenko", "Germani", "017684589208"));
        System.out.println(personInfo("Bred", "Pitt", "USA", "+12126575256"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
//        String info = "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
//        return info;
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
    }
    }

