package com.MazeProblems;

import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(maze(3, 3));
        maze("", 3, 3);
    }
    static int maze(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = maze(r-1, c);
        int right = maze(r , c -1);

        return  left + right;
    }

    // print the path
    static void maze(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            maze(p + "D",r-1, c);
        }
        if (c > 1) {
            maze(p + "R", r, c - 1);
        }
    }

}
