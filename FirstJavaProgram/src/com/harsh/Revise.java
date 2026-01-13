package com.harsh;

import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Num is Even!!");
        }else {
            System.out.println("Num is odd!!");
        }
    }
}
