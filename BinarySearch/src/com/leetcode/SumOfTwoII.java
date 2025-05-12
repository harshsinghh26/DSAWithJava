package com.leetcode;

import java.util.Arrays;

public class SumOfTwoII {
    public static void main(String[] args) {
        int[] num = {-1, 0};
        int t = -1;
        System.out.println(Arrays.toString(twoSum(num, t)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = numbers.length-1;
        int sum = 0;
        while(start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}
