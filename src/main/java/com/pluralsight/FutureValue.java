package com.pluralsight;

import java.util.Scanner;

public class FutureValue {

    public static Scanner valueFuture = new Scanner(System.in);

    public static void main(String[] args) {
        // calculating the compound interest on a one time deposit
        // the user is going to need to input the deposit, interest rate and number of years
        // the future value and the total interest earned would be displayed
        // the first step would be to set up a scanner on the outside of the main method
        System.out.print("Deposit: ");
        int deposit = valueFuture.nextInt();
        System.out.print("Air: ");
        double air = valueFuture.nextDouble();
        System.out.print("Years: ");
        int totalYears = valueFuture.nextInt();
        int daysInYear = 365;
        int totalDays = daysInYear*totalYears;
        double futureValue = deposit* Math.pow((1+(air/daysInYear)), totalDays );
        double interestEarned = futureValue - deposit;
        System.out.println("future value: " + futureValue);
        System.out.println("interest earned: " + interestEarned);

    }
}
