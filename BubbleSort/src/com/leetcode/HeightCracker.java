package com.leetcode;

import java.util.Arrays;

public class HeightCracker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
    static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        int count = 0;
        boolean isSwapped;
        for(int i = 0; i< expected.length; i++){
            isSwapped = false;
            for(int j = 1; j< expected.length - i; j++){
                if(expected[j] < expected[j - 1]){
                    int temp = expected[j];
                    expected[j] = expected[j - 1];
                    expected[j-1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        for (int k = 0; k < heights.length; k++){
            if (heights[k] != expected[k]){
                count++;
            }
        }
        return count;
    }
}
