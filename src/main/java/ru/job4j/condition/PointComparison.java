package ru.job4j.condition;

public class PointComparison {

    public static boolean isEquals(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(isEquals(1, 1, 2, 2));
        System.out.println(isEquals(10, 10, 10, 10));
    }
}