package com.cyclicSort;

import java.util.ArrayList;

public class AllMisingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }
        // Search for the number
        for (int in = 0; in < nums.length; in++){
            if(nums[in] != in + 1){
                list.add(in + 1);
            }
        }
        return list;
    }
    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
