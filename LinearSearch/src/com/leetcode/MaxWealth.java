package com.leetcode;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 5},{7, 3},{3, 5}};
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] matrix){
        int max = 0;
        int sum = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                sum += matrix[row][col];
            }
            if (sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
