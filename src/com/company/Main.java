package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int firstNumber = 0;
    private static int secondNumber = 1;
    private static int sumFibonnaci = 0;
    private static int indexForFibbonaci = -1;

    private static int tabOfNumbers[];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (indexForFibbonaci<0){
            try {
                System.out.println("Which fibonacci number you want?");
                indexForFibbonaci = scanner.nextInt();
            } catch (InputMismatchException ex){
                System.out.println("You cannot enter String!");
                scanner.next();
            }
        }

        makeSumForFibonacci(indexForFibbonaci);
        numberEqualsTo(indexForFibbonaci);
        sumOfFibonacciNumbers();
        scanner.close();
    }


    private static void makeSumForFibonacci(int indexForFibbonaci) {
        tabOfNumbers = new int[indexForFibbonaci + 1];
        for (int i = 0; i < indexForFibbonaci; i++) {
            tabOfNumbers[i] = sumFibonnaci;
            sumFibonnaci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumFibonnaci;
        }
    }

    private static void numberEqualsTo(int howManyNumbers) {
        switch (howManyNumbers) {
            case 1:
                System.out.println("\n" + howManyNumbers + "st Fibonacci number equals to:");
                break;
            case 2:
                System.out.println("\n" + howManyNumbers + "nd Fibonacci number equals to:");
                break;
            case 3:
                System.out.println("\n" + howManyNumbers + "rd Fibonacci number equals to:");
                break;
            default:
                System.out.println("\n" + howManyNumbers + "th Fibonacci number equals to:");
                break;
        }
        System.out.println(firstNumber);
    }


    private static void sumOfFibonacciNumbers() {

        int sumOfNumbers = 0;
        if (indexForFibbonaci == 0)
            sumOfNumbers = tabOfNumbers[0];
        else if (indexForFibbonaci == 1)
            sumOfNumbers = indexForFibbonaci;

        else {
            sumOfNumbers = tabOfNumbers[0] + tabOfNumbers[1];
            for (int tabOfNumber : tabOfNumbers) {
                sumOfNumbers += tabOfNumber;
            }
        }

        System.out.println("\nSum of " + indexForFibbonaci + " of Fibonacci sequence equals: ");
        System.out.println(sumOfNumbers);
    }

}
