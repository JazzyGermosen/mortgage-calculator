package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculator {
    // creating a scanner to ask for user input on the required tools
    public static Scanner mortgage = new Scanner(System.in);
    public static void main(String[] args) {
        // this is a financial calculator for the clients of a financial orginization
        // in the main method we will be asking the questions for the user to input
        // now that i have a static method next is total interest variable
        // I need to change some of these statements to formulas( monthly payment + interest rate)
        System.out.print("principal: ");
        int principal = mortgage.nextInt();
        System.out.print("Air: ");
        double air = mortgage.nextDouble();
        System.out.print("Loan Years: ");
        int years = mortgage.nextInt();
        System.out.print("Monthly Payment: ");
        int installment = 12 * years;
        System.out.print("Interest Rate: ");
        double interestRate = air / 12;
        // a^b -> Math.pow(a, b)
        double monthlyPayment = principal* (installment*(Math.pow((1+interestRate), installment)) / (Math.pow((1+interestRate), installment)-1));
        double totalInterest = (monthlyPayment*interestRate) - principal;

    }
    // starting out with a method to help ask for input on the required
    // this is going to be do multiply
    // i cannot find out how to effectively use a static method
    // i wanted to have all the information be output but since i probably cant call on those variables in the main method it wouldnt work there
    // public static double askQuestion(String scanner){
        //return 0;



}
