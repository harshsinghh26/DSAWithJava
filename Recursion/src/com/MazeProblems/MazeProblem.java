package com.MazeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(maze(3, 3));
//        maze("", 3, 3);
//        System.out.println(mazeA("", 3, 3));
        System.out.println(mazeAD("", 3, 3));
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

    // add it in array list

    static ArrayList<String> mazeA(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1){
            ans.addAll(mazeA(p + "D",r-1, c));
        }
        if (c > 1) {
            ans.addAll(mazeA(p + "R", r, c - 1));
        }
        return ans;
    }


    // can go diagonal Also

    static ArrayList<String> mazeAD(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1){
            ans.addAll(mazeAD(p + 'D', r-1, c -1));
        }
        if (r > 1){
            ans.addAll(mazeAD(p + "V",r-1, c));
        }
        if (c > 1) {
            ans.addAll(mazeAD(p + "H", r, c - 1));
        }
        return ans;
    }


}
