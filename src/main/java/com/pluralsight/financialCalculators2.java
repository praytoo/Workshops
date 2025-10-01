package com.pluralsight;

import java.util.Scanner;

public class financialCalculators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did you deposit?");
        double deposit = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the interest rate?");
        double interest1 = scanner.nextDouble();
        scanner.nextLine();
        double interest = (interest1) / 100;
        System.out.println("What is the number of years?");
        double t = scanner.nextDouble();
        scanner.nextLine();
        double n = 365.0;
        double FV = deposit * Math.pow(1 + (interest / n), n * t);
        double totalInterest;
        totalInterest = FV-deposit;
        System.out.println(" If you deposit $" + deposit + " " + "in a CD that earns" + " " + interest + " " + "% interest and matures in" + " " + t + " " + "years, your CD's ending balance will be $" + FV + " " + "and you would have earned $" + totalInterest + " " + "in interest");
    }
}
