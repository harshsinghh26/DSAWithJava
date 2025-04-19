package com.easy;

public class CountLengthOfString {
    public static void main(String[] args) {
        System.out.println(count(0, "abcd"));
    }
    static int count(int count, String str){
        if (str.isEmpty()){
            return count;
        }

        return count(count + 1, str.substring(1));
    }
}
