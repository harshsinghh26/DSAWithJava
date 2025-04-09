package com.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for (int i = 1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<=n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
