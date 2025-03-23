package com.leetcode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] mat = {18, 124, 9, 1764, 98, 1};
        System.out.println(findEvenDigits2(mat));
    }
    static int findEvenDigits(int[] arr){
        int count = 0;
        int dcount = 0;
        for (int i = 0; i< arr.length; i++){
            int element = arr[i];
            while (element > 0){
                element /= 10;
                dcount++;
            }
            if (dcount % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int findEvenDigits2(int[] arr){
        int count = 0;
        int dcount = 0;
        for (int j : arr) {
            while (j > 0) {
                j /= 10;
                dcount++;
            }
            if (dcount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
