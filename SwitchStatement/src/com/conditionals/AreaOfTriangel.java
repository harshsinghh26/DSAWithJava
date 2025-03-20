package com.conditionals;

import java.util.Scanner;

public class AreaOfTriangel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of triangle: ");
        int h = in.nextInt();

        float A = (0.5f) * b * h;
        System.out.print("Area of Triangle is: " + A);
    }
}
