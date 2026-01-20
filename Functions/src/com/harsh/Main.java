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

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int sum = sumOfNum(a, b);

        System.out.println("Sum of the given number is = " + sum);
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

}