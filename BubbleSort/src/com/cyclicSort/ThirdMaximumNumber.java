package com.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] nums) {
        List<Integer> newAns = sort(nums);
        if (newAns.size() < 3){
            return newAns.getLast();
        }else{
            return newAns.getFirst();
        }

    }

    static List<Integer> sort(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++){
            swapped = false;
            for (int j = 1; j < nums.length - i; j++){
                if (nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j -1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                ans.add(nums[i]);
                i = i + 2;
            }else {
                ans.add(nums[i]);
                i++;
            }
        }
        return ans;
    }
}
