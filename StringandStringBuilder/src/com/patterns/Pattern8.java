package com.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k< i * 2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
