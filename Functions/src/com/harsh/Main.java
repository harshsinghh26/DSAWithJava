package com.harsh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = in.nextLine();
//        System.out.print("Enter your age: ");
//        int age = in.nextInt();
//
//        Eligibility(age, name);

//        System.out.print("Enter first number: ");
//        int a = in.nextInt();
//        System.out.print("Enter second number: ");
//        int b = in.nextInt();
//
//        int sum = sumOfNum(a, b);
//
//        System.out.println("Sum of the given number is = " + sum);

//        System.out.print("Enter the radius of the circle: ");
//        int radius = in.nextInt();
//
//        circumferenceAndAreaOfCircle(radius);

        System.out.print("Enter a num: ");
        int num = in.nextInt();

        primeNum(num);
    }

    // First Program

    static void Eligibility(int age, String name){
        if (age >= 18){
            System.out.println(name + " is eligible for giving Vote!!");
        }else {
            System.out.println(name + " is not eligible for giving Vote!!");
        }
    }

    // Second Program

    static int sumOfNum(int a, int b){
        return a + b;
    }

    // Third Program

    static void circumferenceAndAreaOfCircle(int radius){
        float areaOfCircle = (float) (3.14 * (Math.pow(radius, 2)));
        System.out.println("Area of circle " + areaOfCircle);
        float circumferenceOfCircle = (float) (2 * 3.14 * radius);
        System.out.println("Circumference of circle " + circumferenceOfCircle);
    }

    //Fourth Program

    static void primeNum(int num){
        if (num % 2 != 0 && num % 3 != 0 && num != 1){
            System.out.println("The Given Number is a Prime number!!");
        }else {
            System.out.println("The Given number is not a Prime number!!");
        }

    }
}