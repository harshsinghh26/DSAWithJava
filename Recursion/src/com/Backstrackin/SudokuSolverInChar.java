package com.Backstrackin;

public class SudokuSolverInChar {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'3', '.', '6', '5', '.', '8', '4', '.', '.'},
                {'5', '2', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '8', '7', '.', '.', '.', '.', '3', '1'},
                {'.', '.', '3', '.', '1', '.', '.', '8', '.'},
                {'9', '.', '.', '8', '6', '3', '.', '.', '5'},
                {'.', '5', '.', '.', '9', '.', '6', '.', '.'},
                {'1', '3', '.', '.', '.', '.', '2', '5', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '7', '4'},
                {'.', '.', '5', '2', '.', '6', '3', '.', '.'}
        };

        if (solver(board)){
            display(board);
        } else {
            System.out.println("Can not solve!!");
        }
    }

    static boolean solver(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmptyLeft = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    row = i;
                    col = j;
                    isEmptyLeft = false;
                }
            }
            if (!isEmptyLeft){
                break;
            }
        }
        if (isEmptyLeft){
            return true;
        }

        for (char number = '1'; number <= '9'; number++){
            if (isSafe(board, row, col, number)){
                board[row][col] = number;
                if (solver(board)){
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static void display(char[][] board){
        for (char[] row: board){
            for (char num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, char num){
        for (int i = 0; i < board.length; i++){
            if (board[row][i] == num){
                return false;
            }
        }
        for (char[] nums: board){
            if (nums[col] == num){
                return false;
            }
        }
        int sqrt = (int) (Math.sqrt(board.length));
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for (int r = startRow; r < startRow + sqrt; r++){
            for (int c = startCol; c < startCol + sqrt; c++ ){
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
