package com.video;

import java.util.Scanner;

public class FibbonaciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
//        System.out.println(a);
        for (int i = 1; i<n-1; i++ ){
//            System.out.println(b);
                int fibb = a + b;
                a = b;
                b = fibb;
        }
        System.out.println(b);
    }
}
