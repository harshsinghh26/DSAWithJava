package com.conditionals;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width:");
        int w = in.nextInt();
        System.out.print("Enter the height:");
        int h = in.nextInt();

        int A = w * h;
        System.out.print("Area of Rectangle is: " + A);
    }
}
