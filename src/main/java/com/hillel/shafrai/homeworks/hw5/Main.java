package com.hillel.shafrai.homeworks.hw5;

public class Main {
    public static void main(String[] args) {
        int warriorLi =13;
        int archersLi = 24;
        int riderLi = 46;

       int warriorMin = 9;
        int archersMin = 35;
        int riderMin = 12;

        int sumLi = (warriorLi+archersLi+riderLi)*860;
        double sumMin = ((warriorMin+archersMin+riderMin)*860)*1.5;
        System.out.println( "The general attacks of Lee's army ="+sumLi);
        System.out.println( "The general attacks of the Min army ="+sumMin);

    }
}
