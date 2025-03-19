package com.harsh;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        int P = in.nextInt();
        System.out.print("Enter the Interest rate in %: ");
        int R  = in.nextInt();
        System.out.print("Enter the time: ");
        int T = in.nextInt();

        int  SI  = (P * R * T) / 100;
        System.out.println("The Simple Interest is: " + SI);
    }
}
