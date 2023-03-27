package com.hillel.shafrai.homeworks.hw16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call on Android");
    }

    @Override
    public void sms() {
        System.out.println("SMS on Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet on Android");
    }

    @Override
    public void getVersionOS() {
        System.out.println("Version Ubuntu 22.10");
    }
}

