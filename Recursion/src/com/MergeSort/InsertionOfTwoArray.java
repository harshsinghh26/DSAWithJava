package com.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
//        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        sort(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }

//    static int[] intersection(int[] nums1, int[] nums2) {
//
//
//    }

    static void sort(int[] arr, int s, int e){
        if (e - s == 1){
            return;
        }
        int m  = s + e / 2;
        sort(arr, s , m);
        sort(arr, m, e);
        merge(arr, s, m , e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l <mix.length; l++){
            if (arr[s + l] == mix[l]){
                arr[s + l] = mix[l];
            }
        }
    }
}
