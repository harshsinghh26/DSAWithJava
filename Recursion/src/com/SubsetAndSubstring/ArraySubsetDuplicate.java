package com.SubsetAndSubstring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        List<List<Integer>> ans = arrSubSet(arr);
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }
        System.out.println(ans);
    }
    static List<List<Integer>> arrSubSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i< arr.length; i++){
            start = 0;
            if (i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
