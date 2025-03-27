package com.harsh;

public class CellingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 17, 18};
        int t = 19;
        System.out.println(cellingNumber(nums, t));
    }
    static int cellingNumber(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        if (target > arr[e]){
            return  -1;
        }
        while (s <= e){
            int mid = s + (e - s) / 2;
            if (arr[mid] == target){
                return  mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return s;
    }
}
