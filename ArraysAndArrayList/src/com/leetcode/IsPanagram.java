package com.leetcode;

public class IsPanagram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    static boolean checkIfPangram(String sentence) {
        int count = 0;
        for(int i = 'a'; i <= 'z'; i++){
            for(int j = 0; j < sentence.length(); j++){
                if(i == sentence.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count == 26;
    }
}
