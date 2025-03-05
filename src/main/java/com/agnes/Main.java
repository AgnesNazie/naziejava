package com.agnes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Agnes!");
        // modify the project to carry my name
        // exercise 2 is on variable. i wish ti create a program that declares my age, height, first initials, and if i love java with my full name

        int age = 29;
        double height =162.5;
        char firstInitials = 'A';
        boolean whetherLoveJava = true;
        String fullName = "Agnes Nazie";
        System.out.println( "Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("First Initials:" + firstInitials);
        System.out.println("Whether I Love Java:" + whetherLoveJava);
        System.out.println("Full Name:" + fullName);

        //  practicing how to take user input in *ava
        // in java the scanner class let us take input from the keyboard so i need to import it to perform the task
        // create a simple input program that ask users of favourite color,number and if they like java.

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter your favourite Color");
        String favouriteColor = scanner.nextLine();

        System.out.println("Enter your Favourite Number");
        int favoriteNumber = scanner.nextInt();

        System.out.println("Type True or False whether you like Java");
        boolean whetherYouLikeJava =scanner.nextBoolean();
        // output was for the user to respond to the question with the hint given.

        // practicing  basic operators in java
        //create my own calculator asking user for 2 numbers and also perform basic operations like +,_,*,/,& %.the output should also be clear.

        System.out.println("Enter first number:");
        double num1 =scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double differences = num1 - num2;
        double multiplication = num1 * num2;
        double quotient = num1 / num2;
        double division = num1 % num2;

        System.out.println("sum:" + sum);
        System.out.println("differences:" + differences);
        System.out.println("multiplication:" + multiplication);
        System.out.println("quotient:" + quotient);
        System.out.println("division:" + division);

        System.out.println("----------------------");
        // the output was user interactive and i closed the scanner with scanner.close();.

        // practicing conditional statements (if else) in java.



    }
}