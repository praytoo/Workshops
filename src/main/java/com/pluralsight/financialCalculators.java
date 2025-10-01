package com.pluralsight;

import java.util.Scanner;

public class financialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Principle loan amount?");
        double P = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the interest rate?");
        double ii = scanner.nextDouble();
        scanner.nextLine();
        double i = (ii / 100) / 12;
        System.out.println("How long is the loan length in years?");
        double y = scanner.nextDouble();
        scanner.nextLine();
        double n;
        n = y * 12;
        double M;
        M = P * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        double totalInterest;
        totalInterest = (M*n)-P;
        System.out.println("A $" + " " + P + " " + "loan at 7.625% interest for" + " " + y + " " + "years would have a $" + M + "/mo" + "payment with a total interest of $" + totalInterest);
    }
}
