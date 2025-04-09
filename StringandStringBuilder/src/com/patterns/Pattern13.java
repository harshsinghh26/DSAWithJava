package com.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern13(int n){
        for (int i =1; i<=n; i++){
            for (int j =0; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++){
                if (i == n){
                    System.out.print("*");
                }else {
                    if (k == 1 || k == i * 2 -1){
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
