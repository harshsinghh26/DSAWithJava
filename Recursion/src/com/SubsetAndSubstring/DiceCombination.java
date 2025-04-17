package com.SubsetAndSubstring;

import java.util.ArrayList;

public class DiceCombination {
    public static void main(String[] args) {
//        diceCombination("", 4);
       ArrayList<String> ans =  diceCombinationArray("", 6);
        System.out.println(ans);

    }
    static void diceCombination(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++){
            diceCombination(p + i, target - i);
        }
    }

    // add it into arrayList

    static ArrayList<String> diceCombinationArray(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceCombinationArray(p + i, target - i));
        }
        return ans;
    }
}
