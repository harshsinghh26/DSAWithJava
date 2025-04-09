package com.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void  pattern3(int n){
        for (int i = 0; i < n; i++){
            for (int j = 1; j<= n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
