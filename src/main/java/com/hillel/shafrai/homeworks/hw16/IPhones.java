package com.hillel.shafrai.homeworks.hw16;

public class IPhones implements Smartphones, IOS{

    @Override
    public void call() {
        System.out.println("Call on Iphone");
    }

    @Override
    public void sms() {
        System.out.println("SMS on Iphone");
    }

    @Override
    public void internet() {
        System.out.println("Internet on Iphone");
    }

    @Override
    public void getVersionOS() {
        System.out.println("Version iOS 16");
    }
}
