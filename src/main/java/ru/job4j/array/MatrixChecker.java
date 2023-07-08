package ru.job4j.array;

public class MatrixChecker {
    public static boolean isMonoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char elem : board[row]) {
            if (elem != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isMonoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] row : board) {
            if (row[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] hasExtractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X'
                    && (isMonoHorizontal(board, i) || isMonoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}