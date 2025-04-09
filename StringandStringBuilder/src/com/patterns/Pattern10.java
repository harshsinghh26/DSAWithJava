package com.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<= n- i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
