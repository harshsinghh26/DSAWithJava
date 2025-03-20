package com.conditionals;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is your value is large or small? ");
        char ch = in.next().charAt(0);
        if (ch == 's' || ch == 'S'){
            int A =0;
            System.out.print("Enter the value of base: ");
            int b= in.nextInt();
            System.out.print("Enter the value of height: ");
            int h = in.nextInt();
            if (b == 0 || h == 0){
                System.out.print("Area of Parallelogram is: " + A);
            }else if (b < 0 || h < 0){
                System.out.print("Negative value is not physically possible!");
            }else {
                A = b * h;
                System.out.print("Area of Parallelogram is: " + A);
            }
        }else if (ch == 'l' || ch == 'L'){
            long A = 0;
            System.out.print("Enter the value of base: ");
            long b = in.nextLong();
            System.out.print("Enter the value of height: ");
            long h = in.nextLong();
            A = h * b;
            System.out.print("Area of Parallelogram is: " + A);
        }
    }
}
