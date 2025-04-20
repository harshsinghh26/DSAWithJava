package com.easy;

import java.util.Scanner;

public class SpecialFibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(specialFibb(a, b, n));
        }
    }

    static int specialFibb(int a, int b, int n){
        int mod = n % 3;
        if (mod == 0) return a;
        if (mod == 1) return b;

        return specialFibb(a, b, n-1) ^ specialFibb(a, b, n-2);

    }
}
