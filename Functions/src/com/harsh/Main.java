package com.harsh;

import java.util.Arrays;
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

        System.out.print("Enter a num: ");
        int num = in.nextInt();

        boolean ans = primeNum(num);
        if (!ans){
            System.out.println("The given num is not a Prime Number!!");
        }else {
            System.out.println("The given num is a Prime Number!!");
        }

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

        // 9

//        System.out.print("Enter a natural num: ");
//        int num = in.nextInt();
//
//        int ans = sumOfN(num);
//
//        System.out.println("Total sum of all numbers is = " + ans);

        // 10

//        System.out.print("Enter first num: ");
//        int f = in.nextInt();
//        System.out.print("Enter second num: ");
//        int s = in.nextInt();
//
//        int[] ans = primeNum(f, s);
//
//        System.out.println(Arrays.toString(ans));
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

    static boolean primeNum(int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
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

    // Ninth Program

    static int sumOfN(int n){
        int sum = 0;

        for (int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    // Tenth Program

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    static int[] primeNum(int m, int n){

        int[] temp = new int[n-m+1];
        int index = 0;

        for (int i = m; i<=n; i++){
            if (isPrime(i)){
                temp[index++] = i;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }
}