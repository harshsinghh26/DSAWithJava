package com.BubbleSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 15, 17, 5, 10, 11};
        int i = 0;
        insertionSort(arr, 0, i+1);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr, int i, int j){
        if (i == arr.length-1){
            return;
        }

        if (j > 0){
            if (arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j-1] = temp;
            }
            insertionSort(arr, i, j-1);
        }else {
            i++;
            insertionSort(arr, i, i+1);
        }
    }
}
