package com.MazeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[maze.length][maze[0].length];
//        mazeWithRiverPath("", maze, 0, 0);
//        System.out.println(mazeWithRiverPathA("", maze, 0, 0));
        mazeWithRiverAllPath("", maze, 0, 0, path, 1);
    }
    static ArrayList<String> mazeWithRiverPathA(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!maze[r][c]){
            return new ArrayList<>();
        }

        maze[r][c] = false;
        ArrayList<String> ans = new ArrayList<>();
        if (r < maze.length -1){
            ans.addAll(mazeWithRiverPathA(p + "D", maze, r +1, c));
        }
        if (c < maze[0].length - 1){
            ans.addAll(mazeWithRiverPathA(p + "R", maze, r, c+1));
        }
        if (r > 0){
            ans.addAll(mazeWithRiverPathA(p + "U", maze, r-1, c));
        }
        if (c > 0){
            ans.addAll(mazeWithRiverPathA(p + "L", maze, r, c-1));
        }
        maze[r][c] = true;
        return ans;
    }

    static void mazeWithRiverPath(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        if (r < maze.length -1){
            mazeWithRiverPath(p + "D", maze, r +1, c);
        }
        if (c < maze[0].length - 1){
            mazeWithRiverPath(p + "R", maze, r, c+1);
        }
        if (r > 0){
            mazeWithRiverPath(p + "U", maze, r-1, c);
        }
        if (c > 0){
            mazeWithRiverPath(p + "L", maze, r, c-1);
        }
        maze[r][c] = true;
    }

    // Print all path in matrix

    static void mazeWithRiverAllPath(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length -1){
            mazeWithRiverAllPath(p + "D", maze, r +1, c, path, step+1);
        }
        if (c < maze[0].length - 1){
            mazeWithRiverAllPath(p + "R", maze, r, c+1, path, step+1);
        }
        if (r > 0){
            mazeWithRiverAllPath(p + "U", maze, r-1, c, path, step+1);
        }
        if (c > 0){
            mazeWithRiverAllPath(p + "L", maze, r, c-1, path, step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
