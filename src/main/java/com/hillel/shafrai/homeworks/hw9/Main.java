package com.hillel.shafrai.homeworks.hw9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int min = 18;
        int max = 40;
        final int COUNT_PLAYERS =25;
        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        double sumYearsTeam1 = 0;
        double sumYearsTeam2 = 0;
        double argYearsTeam1;
        double argYearsTeam2;

        for (int i = 0; i <COUNT_PLAYERS ; i++) {
            team1[i] = getRandomNumber(min, max);
            sumYearsTeam1 +=team1[i];
            team2[i] = getRandomNumber(min, max);
            sumYearsTeam2 +=team2[i];
        }
        argYearsTeam1 = sumYearsTeam1 / COUNT_PLAYERS;
        argYearsTeam2 = sumYearsTeam2 / COUNT_PLAYERS;

        System.out.println("team1:"+ Arrays.toString(team1));
        System.out.println("team2:"+ Arrays.toString(team2));
        System.out.println("arg team1 :" +argYearsTeam1);
        System.out.println("arg team2 :" +argYearsTeam2);

    }
    static int getRandomNumber(int min, int max){
        return (int) (Math.random()* (max - min +1))+min;
    }
       }

    
