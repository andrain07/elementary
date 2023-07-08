package ru.job4j.condition;

public class Max {
    public static int getMax(int left, int right) {
        return Math.max(left, right);
    }

    public static int getMax(int first, int second, int third) {
        return first > third ? Math.max(first, second) : Math.max(third, second);
    }

    public static int getMax(int first, int second, int third, int fourth) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        if (fourth > max) {
            max = fourth;
        }
        return max;
    }
}