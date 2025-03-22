package com.harsh;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three nums: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        min(n1, n2, n3);
        System.out.println(" ");
        max(n1, n2, n3);
    }
    static void min(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if (c < b){
            min = c;
        }
        System.out.print("Minimum of all: " + min);
    }
    static void max(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > b){
            max = c;
        }
        System.out.print("Maximum of all: " + max);
    }
}
