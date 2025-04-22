package com.easy;

public class CheckDuplicate {
    public static void main(String[] args) {
        check("aabb", 0, 1);
    }
    static void check(String str, int i, int j){
        StringBuilder p = new StringBuilder();
        if(i == str.length() -1){
            System.out.println(p);
            return;
        }
        if (j < str.length() && str.charAt(i) == str.charAt(j)){
            check(str, i, j +1);
        }else if (i < str.length() - 1){
            p.append(str.charAt(i));
            i = j;
            check(str, i, j+1);
        }
    }
}
