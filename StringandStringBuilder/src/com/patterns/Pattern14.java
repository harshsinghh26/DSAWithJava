package com.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = n * 2; k>= i*2; k--){
                if (i == 1){
                    System.out.print("*");
                }else {
                    if (k == n * 2 || k == i * 2){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
