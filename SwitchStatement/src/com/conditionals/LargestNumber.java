package com.conditionals;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true){
            System.out.print("Enter your nums: ");
            int num = in.nextInt();
            if (num > 0){
                if (num > max){
                    max = num;
                }
            }else {
                System.out.print("The Maximum of all is: " + max);
                break;
            }
        }
    }
}
