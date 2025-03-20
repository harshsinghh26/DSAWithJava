package com.conditionals;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is the height given? ");
        char ch = in.next().charAt(0);
        if (ch == 'y' || ch == 'Y'){
            System.out.print("Enter the height: ");
            int h = in.nextInt();
            System.out.print("Enter the base: ");
            int b = in.nextInt();
            float A = (0.5f) * b * h;
            System.out.print("Area of Isosceles Triangle is: " + A);
        }
        if (ch == 'n' || ch == 'N'){
            System.out.print("Enter the length of two equal sides: ");
            int a = in.nextInt();
            System.out.print("Enter the value of Base: ");
            int b = in.nextInt();
            float v = ((a * a) - ((float) b / 2 * (float) b / 2));
            float h = (float) Math.sqrt(v);
            float A = (0.5f) * b * h;
            System.out.print("Area of Isosceles Triangle is: " + A);
        }
    }
}
