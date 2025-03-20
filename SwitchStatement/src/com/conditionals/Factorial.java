package com.conditionals;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        int fac = n;
        if (n == 0 || n == 1){
            fac = 1;
            System.out.print("Factorial of num is: " + fac);
        }
        for (int i = 1; i< n; i++){
            fac *= (n-i);
        }
        System.out.print("Factorial of the num is: " + fac);
    }
}
