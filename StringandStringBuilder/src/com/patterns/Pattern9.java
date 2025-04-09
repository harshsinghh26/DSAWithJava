package com.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = n * 2; k >= i * 2; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
