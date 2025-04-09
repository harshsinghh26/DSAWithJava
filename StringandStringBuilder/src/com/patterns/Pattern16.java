package com.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    static void pattern16(int n){
        for (int i = 0; i<=n; i++){
            for (int j = 0; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < i *2; k++){
                if ( k == 1 || k == i * 2 - 1){
                    System.out.print(1);
                }else if(k %2 == 0){
                    System.out.print(" ");
                }else{
                    if (i == n && k == n){
                        System.out.print(i + 1);
                    }else {
                        System.out.print(i - 1);
                    }
                }
            }
            System.out.println();
        }
    }
}
