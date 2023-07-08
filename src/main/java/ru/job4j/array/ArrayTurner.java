package ru.job4j.array;

public class ArrayTurner {
    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int swap = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = swap;
        }
        return array;
    }
}