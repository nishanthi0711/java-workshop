package com.vetias.java.workshop.basics;

import java.util.Scanner;

public class Agecalculator {
    public static void main(String[]args){
        system.out.println(x:"Enter your birth year:");
        Scanner sc = new Scanner(System.in);
        System.out.println(x: "Enter the date of birth (YYYY-MM-DD)");
        String dateofbirth= sc. nextline();
        LocalDate birthdate = LocalDate.parse(dateofbirth);
        int yearofbirth = birthdate.getyear();
        int currentYear = LocalDate>now().getyear();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }
}
