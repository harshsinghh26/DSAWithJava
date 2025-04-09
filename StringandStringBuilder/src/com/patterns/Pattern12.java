package com.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<= n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<= n -i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
