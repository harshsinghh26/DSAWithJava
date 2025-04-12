package com.Array;

public class CheckTarget {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 18;
        System.out.println(checkTarget(arr, 0, target));
    }
    static int checkTarget(int[] arr, int i, int target){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return checkTarget(arr, i+1, target);
    }
}
