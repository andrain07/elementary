package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private final int x;
    private final int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double getDistance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.getDistance(b);
        System.out.println(dist);
    }
}