package com.SubsetAndSubstring;
import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = arrSubSet(arr);
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }
        System.out.println(ans);
    }
    static List<List<Integer>> arrSubSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
