package com.SubsetAndSubstring;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permutation("", "abc");
//        ArrayList<String> str = permutationInArrayList("", "abc");
//        System.out.println(str);
        System.out.println(permutationCount("", "abcb", 0));

    }
    static void  permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    // add it in arraylist

    static ArrayList<String> permutationInArrayList(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ArrayList<String> str = permutationInArrayList(f + ch + s, up.substring(1));
            list.addAll(str);
        }
        return list;
    }

    // Count the nub of answer
    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }

    // Count by passing in arguments

    static int permutationCount(String p, String up, int count){
        if (up.isEmpty()){
            return count + 1;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count=  permutationCount(f + ch + s, up.substring(1), count);
        }
        return count;
    }


}
