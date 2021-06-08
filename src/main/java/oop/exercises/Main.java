package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args) {
        double amount, tax;
        String state, county;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        amount = input.nextDouble();
        System.out.print("What is the state? ");
        state = input.next();

        tax = 0.00;

        if (state.equals("Wisconsin")) {
            System.out.print("Enter the county of residence: ");
            county = input.next();

            if (county.equals("Eau Claire")) {
                tax = 0.05;
            } else if (county.equals("Dunn")) {
                tax = 0.04;
            }
        } else if (state.equals("Illinois")) {
            tax = 0.08;
        }

        if (tax > 0.0) {
            System.out.println("The tax is $" + amount * tax + ".");
        }

        System.out.printf("The total is $%.2f.\n", amount * (1 + tax));
    }
}
