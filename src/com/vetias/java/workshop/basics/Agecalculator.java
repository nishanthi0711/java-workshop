package com.vetias.java.workshop.basics;

import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        scanner.close();
    }
 
    }
