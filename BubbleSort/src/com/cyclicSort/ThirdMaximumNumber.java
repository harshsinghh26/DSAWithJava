package com.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
//        System.out.println(Arrays.toString(removeDuplicates(nums)));
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] nums) {
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        int[] reversed = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
        int [] arr = removeDuplicates(reversed);

        if (arr.length < 3){
            return Arrays.stream(arr).max().getAsInt();
        }else{
            return arr[2];
        }

    }
    static int[] removeDuplicates(int[] arr){
        int  n = arr.length;
        int[] newArr = new int[n];
        int j = 0;
        boolean isDuplicate;

        for (int i = 0; i < n; i++){
            isDuplicate = false;
            for (int k = 0; k<j; k++){
                if (arr[i] == arr[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                newArr[j] = arr[i];
                j++;
            }
        }
        return Arrays.copyOf(newArr, j);
    }
}
