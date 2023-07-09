package ru.job4j.condition;

public class Max {
    public static int getMax(int left, int right) {
        return Math.max(left, right);
    }

    public static int getMax(int first, int second, int third) {
        return getMax(first, getMax(second, third));
    }

    public static int getMax(int first, int second, int third, int fourth) {
        return getMax(getMax(first, second), getMax(third, fourth));
    }
}