package com.hillel.shafrai.homeworks.hw7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int magicNum = 9; random.nextInt(11);
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 0 and 10. Can you guess the number?");

        while (attempts < 3) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == magicNum) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < magicNum) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

    }
}