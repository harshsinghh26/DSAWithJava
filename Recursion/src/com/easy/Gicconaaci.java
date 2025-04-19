package com.easy;

import java.util.Scanner;

public class Gicconaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(geekonacci(A, B, C, N));
        }
    }
    static int geekonacci(int A, int B, int C, int N) {
        if (N == 1) return A;
        if (N == 2) return B;
        if (N == 3) return C;

        return geekonacci(A, B, C, N - 1) + geekonacci(A, B, C, N - 2) + geekonacci(A, B, C, N - 3);
    }
}
