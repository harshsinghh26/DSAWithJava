package com.leetcode;

import java.util.Arrays;

public class FlipTheArrayImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] newImage = new int[image.length][image[0].length];
        int k = 0;
        for(int i =0; i < image.length; i++){
            for(int j = image[i].length - 1; j >= 0; j--){
                newImage[i][k] = image[i][j];
                if(newImage[i][k] == 0){
                    newImage[i][k] = 1;
                }else {
                    newImage[i][k] = 0;
                }
                k++;
            }
            k = 0;
        }
        return newImage;
    }
}
