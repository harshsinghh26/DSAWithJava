package com.harsh;

import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {

        // First Program

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a num: ");
//        int num = in.nextInt();
//        if(num % 2 == 0){
//            System.out.println("Num is Even!!");
//        }else {
//            System.out.println("Num is odd!!");
//        }

        // Second Program

//        System.out.print("Enter your name: ");
//        String name = in.nextLine();
//        System.out.println("Hello, " + name + " Good Morning!!");


        // Third Program

//        System.out.print("Enter the principal amount: ");
//        int p = in.nextInt();
//        System.out.print("Enter the interest rate (per year): ");
//        int r = in.nextInt();
//        System.out.print("Enter the time: ");
//        int t = in.nextInt();
//
//        int SI = (p * r * t)/100;
//
//        System.out.println(SI + " is your simple interest");

        // Fourth Program

//        System.out.print("Enter an Operator: ");
//        String op = in.next();
//        System.out.print("Enter First Number: ");
//        int a = in.nextInt();
//        System.out.print("Enter Second Number: ");
//        int b = in.nextInt();
//        int ans = 0;
//
//        if (op.equals("+")){
//            ans = a + b;
//        }if(op.equals("-")){
//            ans = a - b;
//        }if(op.equals("*")){
//            ans = a * b;
//        }if(op.equals("/")){
//            ans = a/b;
//        }else {
//            System.out.println("Wrong operator");;
//        }
//
//        System.out.println("Your answer is: " + ans);

        // Fifth Program

//        System.out.print("Enter first number: ");
//        int a = in.nextInt();
//        System.out.print("Enter second number: ");
//        int b = in.nextInt();
//        if (a > b){
//            System.out.println(a + " is the Largest number");
//        }else {
//            System.out.println(b + " is the Largest number");
//        }

        // sixth Program

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
//        System.out.println(b);

        for (int i = 0; i<n-2; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
