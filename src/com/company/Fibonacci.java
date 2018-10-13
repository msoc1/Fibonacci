package com.company;

import java.util.Scanner;

public class Fibonacci {
    private static int firstNumber = 0;
    private static int secondNumber = 1;
    private static int sumFibonnaci = 0;

    public static void main(String[] args) {
        System.out.println(" Which fibonacci number you want?");

        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int indexForFibbonaci = scanner.nextInt();

        int[] tabOfNumbers = new int[indexForFibbonaci];
        for (int i = 0; i < indexForFibbonaci; i++) {
            tabOfNumbers[i] = sumFibonnaci;
            sumFibonnaci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumFibonnaci;
        }


        switch (indexForFibbonaci) {
            case 1:
                System.out.println("\n" + indexForFibbonaci + "st Fibonacci number equals to:");
                break;
            case 2:
                System.out.println("\n" + indexForFibbonaci + "nd Fibonacci number equals to:");
                break;
            case 3:
                System.out.println("\n" + indexForFibbonaci + "rd Fibonacci number equals to:");
                break;
            default:
                System.out.println("\n" + indexForFibbonaci + "th Fibonacci number equals to:");
                break;
        }

            System.out.println(firstNumber);

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
