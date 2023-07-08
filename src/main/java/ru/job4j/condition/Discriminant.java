package ru.job4j.condition;

public class Discriminant {
    public static int calcDiscriminant(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = Discriminant.calcDiscriminant(a, b, c, x);
        System.out.println(rsl);
    }
}