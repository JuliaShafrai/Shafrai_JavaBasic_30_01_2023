package com.hillel.shafrai.homeworks.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Volume of the parallelepiped");
        int heightPre = 30;
        int lenghtPre = 26;
        int widthPre = 22;

        int volume = heightPre * lenghtPre * widthPre;
        int lenght = heightPre + lenghtPre + widthPre;
        System.out.println("Об'єм паралелепіпеда =" +volume);
        System.out.println("Сумарна довжина сторін =" +lenght);
    }

    }

