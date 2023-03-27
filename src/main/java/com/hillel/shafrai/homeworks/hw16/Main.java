package com.hillel.shafrai.homeworks.hw16;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.getVersionOS();

        System.out.println();

        IPhones iphone = new IPhones();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.getVersionOS();
    }
}
