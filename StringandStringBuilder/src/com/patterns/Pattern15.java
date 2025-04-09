package com.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }
    static void pattern15(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++){
                if (k == 1 || k == i * 2 - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i<n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = n * 2; k > i * 2; k--){
                if (k == n*2-1 || k == i * 2 + 1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
