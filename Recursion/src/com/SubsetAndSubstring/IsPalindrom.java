package com.SubsetAndSubstring;

public class IsPalindrom {
    public static void main(String[] args) {
        String s = "geek";
        System.out.println(palPartition(s));
    }
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Recursive function to find the minimum number of
    // cuts needed for palindrome partitioning
    static int palPartitionRec(String s, int i, int j) {

        // Base case: If the substring is empty
        // or a palindrome, no cuts needed
        if (i >= j || isPalindrome(s, i, j))
            return 0;

        int res = Integer.MAX_VALUE, cuts;

        // Iterate through all possible partitions
        // and find the minimum cuts needed
        for (int k = i; k < j; k++) {
            cuts = 1 + palPartitionRec(s, i, k) +
                    palPartitionRec(s, k + 1, j);
            res = Math.min(res, cuts);
        }

        return res;
    }
    static int palPartition(String s) {
        return palPartitionRec(s, 0, s.length() - 1);
    }
}
