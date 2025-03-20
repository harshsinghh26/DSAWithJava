package com.conditionals;

import java.util.Scanner;

public class SumOAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter your nums: ");
            int num = in.nextInt();
            if (num > 0){
                ans += num;
            }else {
                System.out.print("Sum of all numbers: " + ans);
                break;
            }
        }
    }
}
