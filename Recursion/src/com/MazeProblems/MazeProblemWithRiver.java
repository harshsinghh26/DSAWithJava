package com.MazeProblems;

import java.util.ArrayList;

public class MazeProblemWithRiver {
    public static void main(String[] args) {
//        System.out.println(mazeWithRiver(2, 3));
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
//        mazeWithRiverPath("", maze, 0, 0);
        System.out.println(mazeWithRiverPathA("", maze, 0, 0));
    }
    static int mazeWithRiver(int r, int c){
        int count = 0;
        if (r == 1 || c == 1){
            return 1;
        }
        if (r == 2 && c == 2){
            return 0;
        }else {
            int left= mazeWithRiver(r -1, c);
            int right = mazeWithRiver(r, c-1);
            count = right + left;
        }
        return count;
    }

    // return the path

    static  void mazeWithRiverPath(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length -1){
            mazeWithRiverPath(p + "D", maze, r +1, c);
        }
        if (c < maze[0].length - 1){
            mazeWithRiverPath(p + "R", maze, r, c+1);
        }
    }

    // add it into array

    static ArrayList<String> mazeWithRiverPathA(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r < maze.length -1){
            ans.addAll(mazeWithRiverPathA(p + "D", maze, r +1, c));
        }
        if (c < maze[0].length - 1){
            ans.addAll(mazeWithRiverPathA(p + "R", maze, r, c+1));
        }
        return ans;
    }



}
