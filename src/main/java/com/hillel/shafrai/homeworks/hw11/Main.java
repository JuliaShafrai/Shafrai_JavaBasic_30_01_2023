package com.hillel.shafrai.homeworks.hw11;


import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m;
            System.out.println("Please enter the first number:");
            while (true) {
                if (scanner.hasNextInt()) {
                    m = scanner.nextInt();
                    if (m <= 0) {
                        System.out.println("Please enter a number greatest than zero");
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Wrong data! Try again!");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();
            int n ;
            System.out.println("Please enter the second number:");
            while (true) {
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("Please enter a number greatest than zero");
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Wrong data! Try again!");
                    scanner.nextLine();
                }
            }

            int[][] array1 = new int[m][n];
            int[][] array2 = new int[n][m];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = (int) (Math.random() * 10);
                }
            }

            System.out.println();
            System.out.println("Matrix");
            for (int[] ints : array1) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Transposed matrix");
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = array1[j][i];
                }
            }
            for (int[] ints : array2) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }

