package com.SubsetAndSubstring;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        ArrayList<String> ans = combination("", "27");
        System.out.println(ans);
    }
    static void combination0(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int ch = up.charAt(0) - '0';
        for (int i = (ch - 1) * 3; i < ch * 3; i++){
            char newCh = (char)('a' + i);
            combination(p + newCh, up.substring(1));
        }
    }

    static ArrayList<String> combination(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int ch = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        if (ch == 7) {
            for (int i = (ch - 2) * 3; i <= (ch - 1) * 3; i++) {
                char newCh = (char) ('a' + i);
                ans.addAll(combination(p + newCh, up.substring(1)));
            }
        }else if (ch == 9) {
            for (int i = (ch - 2) * 3 + 1; i <= (ch - 1) * 3 + 1; i++) {
                char newCh = (char) ('a' + i);
                ans.addAll(combination(p + newCh, up.substring(1)));
            }
        }
        else {
            for (int i = (ch - 2) * 3; i < (ch-1) * 3; i++){
                char newCh = (char)('a' + i);
                ans.addAll(combination(p + newCh, up.substring(1)));
            }
        }
        return ans;
    }
}
