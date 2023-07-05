package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        if (size <= 0) {
            return new int[0][0];
        }

        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }

        return result;
    }
}
