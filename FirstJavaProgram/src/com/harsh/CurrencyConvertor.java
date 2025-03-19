package com.harsh;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in Rs: ");
        int r = in.nextInt();
        int USD = r * 86;
        System.out.println("Your USD amount is: " + USD);
    }
}
