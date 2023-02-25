package com.hillel.shafrai.homeworks.hw8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shuttle to Mars:");
        int counter=0;
        for ( int i = 1; i <= 100; i++) //noinspection SingleStatementInBlock
        {

            if (i / 10 == 4 || i / 10 == 9   || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println("shuttle number = " + i);
            counter++;
        }

        System.out.println("count lucky shuttle = " + counter);







    }
}
