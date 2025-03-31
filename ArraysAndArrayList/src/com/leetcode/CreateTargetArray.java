package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] i = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(arr, i)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        int in = 0;
        for(int n: list){
            target[in++] = n;
        }
        return target;
    }
}
