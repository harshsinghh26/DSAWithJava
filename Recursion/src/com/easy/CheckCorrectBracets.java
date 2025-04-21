package com.easy;

import java.util.Arrays;

public class CheckCorrectBracets {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(isCorrect(str)); // true
    }

    static boolean isCorrect(String str) {
        return check(str, 0, str.length() - 1);
    }

    static boolean check(String str, int start, int end) {
        if (start > end) return true;

        char open = str.charAt(start);
        char close = getMatching(open);

        if (close == ' ') return false; // Not an opening bracket

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (str.charAt(i) == open) count++;
            else if (str.charAt(i) == close) count--;

            // Found matching close
            if (count == 0) {
                // Recursively check inside and after the matched pair
                return check(str, start + 1, i - 1) && check(str, i + 1, end);
            }
        }
        return false; // No matching close found
    }

    static char getMatching(char ch) {
        if (ch == '(') return ')';
        if (ch == '{') return '}';
        if (ch == '[') return ']';
        return ' ';
    }
}
