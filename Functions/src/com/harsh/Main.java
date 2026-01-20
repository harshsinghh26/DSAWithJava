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

        // 2

//        System.out.print("Enter first number: ");
//        int a = in.nextInt();
//        System.out.print("Enter second number: ");
//        int b = in.nextInt();
//
//        int sum = sumOfNum(a, b);
//
         // 3

//        System.out.println("Sum of the given number is = " + sum);

//        System.out.print("Enter the radius of the circle: ");
//        int radius = in.nextInt();
//
//        circumferenceAndAreaOfCircle(radius);

        // 4

//        System.out.print("Enter a num: ");
//        int num = in.nextInt();
//
//        primeNum(num);

        // 5

//        System.out.print("Enter your marks: ");
//        int marks = in.nextInt();
//
//        findGrades(marks);

        // 6

//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//
//        int factOfNum = Factorial(num);
//
//        System.out.println("Factorial of given number is = " + factOfNum);

        // 7

//        System.out.print("Enter a num: ");
//        int num = in.nextInt();
//
//        isPalindrome(num);

        // 8

//        int[] arr = {3, 1, 4, 6, 5};
//        boolean ans = isTriplet(arr);
//        System.out.println(ans);

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

    // Fifth Program

    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail

    static void findGrades(int marks){
        if (marks > 90 && marks <= 100){
            System.out.println("Your Grades is = AA");
        } else if (marks > 80 && marks <= 90){
            System.out.println("Your Grades is = AB");
        }else if (marks > 70 && marks <= 80){
            System.out.println("Your Grades is = BB");
        }else if (marks > 60 && marks <= 70){
            System.out.println("Your Grades is = BC");
        }else if (marks > 50 && marks <= 60){
            System.out.println("Your Grades is = CD");
        }else if (marks > 40 && marks <= 50){
            System.out.println("Your Grades is = DD");
        }else if (marks <= 40){
            System.out.println("Your Grades is = Fail");
        }else {
            System.out.println("Invalid Marks!!");
        }
    }

    // Sixth Program

    static int Factorial(int num){
        int fact = 1;

        for (int i = 0; i<num; i++){
            fact *= (num - i);
        }
        return fact;
    }

    // Seventh Program

    static void isPalindrome(int num){
        int reverse = 0;
        int checkNum = num;

        while (num > 0){
            int rem = num % 10;

            reverse = reverse * 10 + rem;
            num = num/10;
        }

        if (reverse == checkNum){
            System.out.println("The given num is Palindrome!!");
        }else {
            System.out.println("The given num is not Palindrome!!");
        }
    }

    // Eighth Program

    static boolean isTriplet(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n; i++){
            for (int j = i + 1; j<n; j++){
                for (int k = j + 1; k<n; k++){

                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if (x == y + z || y == x + z || z == x + y) return true;
                }
            }
        }
        return false;
    }
}