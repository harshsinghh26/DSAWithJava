package com.conditionals;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi = 3.1416f;
        System.out.print("Enter the value of radius: ");
        int radius = in.nextInt();
        float A = (radius * radius) * pi;
        System.out.print("Area of the circle is: " + A);
    }
}
