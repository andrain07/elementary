package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        if (data.length == 1) {
            return true;
        }

        boolean result = true;
        boolean base = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] != base) {
                result = false;
                break;
            }
        }

        return result;
    }
}