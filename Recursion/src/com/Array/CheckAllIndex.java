package com.Array;

import java.util.ArrayList;

public class CheckAllIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 6, 7};
        int target = 4;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(findAllIndex(arr, target, 0, ans));
//        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));

    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list){
        if (i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return findAllIndex(arr, target, i+1, list);
    }

    // Second way

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i){

        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> allAnswerBelow =  findAllIndex2(arr, target, i+1);

        list.addAll(allAnswerBelow);
        return list;
    }
}
