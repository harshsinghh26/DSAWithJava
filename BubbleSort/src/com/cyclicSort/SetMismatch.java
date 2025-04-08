package com.cyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int index = 0;
        while(index < nums.length){
            int correct = nums[index] - 1;
            if(nums[index] != nums[correct]){
                swap(nums, index, correct);
            }else{
                index++;
            }
        }

        // Search for missing and duplicate numbers

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                arr[0] = nums[i];
                arr[1] = i + 1;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
