package com.hillel.shafrai.homeworks.hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstTeamName = "";
        if (scanner.hasNextLine()) {
            firstTeamName = scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

        int firstTeamFrag1 = -1;
        int firstTeamFrag2 = -1;
        int firstTeamFrag3 = -1;
        int firstTeamFrag4 = -1;
        int firstTeamFrag5 = -1;

        System.out.println("Please enter the number of frags for five first team players:");

        if (scanner.hasNextInt()) {
            firstTeamFrag1 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }


            if (scanner.hasNextInt()) {
                firstTeamFrag2 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextInt()) {
                firstTeamFrag3 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextInt()) {
                firstTeamFrag4 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextInt()) {
                firstTeamFrag5 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
            scanner.nextLine();

            System.out.println("Please enter the second team name:");
            String secondTeamName = "";
            if (scanner.hasNextLine()) {
                secondTeamName = scanner.nextLine();
            } else {
                System.out.println("Wrong data! Restart program");
                System.exit(0);
            }
            int secondTeamFrag1 = -1;
            int secondTeamFrag2 = -1;
            int secondTeamFrag3 = -1;
            int secondTeamFrag4 = -1;
            int secondTeamFrag5 = -1;
            System.out.println("Please enter the number of frags for five second team players:");

            if (scanner.hasNextLine()) {
                secondTeamFrag1 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextLine()) {
                secondTeamFrag2 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextLine()) {
                secondTeamFrag3 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextLine()) {
                secondTeamFrag4 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            if (scanner.hasNextLine()) {
                secondTeamFrag5 = scanner.nextInt();
            } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

            double firstTeamAverage = (firstTeamFrag1 + firstTeamFrag2 + firstTeamFrag3 + firstTeamFrag4 + firstTeamFrag5) / 5.0;
            double secondTeamAverage = (secondTeamFrag1 + secondTeamFrag2 + secondTeamFrag3 + secondTeamFrag4 + secondTeamFrag5) / 0.5;

            if (firstTeamAverage > secondTeamAverage) {
                System.out.println("Перемогла команда " + firstTeamName + " набрала " + firstTeamAverage + " очків");
            } else if (firstTeamAverage < secondTeamAverage) {
                System.out.println("Перемогла команда " + secondTeamName + " набрала " + secondTeamAverage + " очків");
            } else {
                System.out.println("Нічия");
            }
        }
    }
