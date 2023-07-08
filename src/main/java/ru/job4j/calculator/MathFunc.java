package ru.job4j.calculator;

public class MathFunc {

    public static int calculateSomeMultiplication(int x) {
        return x * x + 1;
    }

    public static int calculateSomeDivision(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.calculateSomeMultiplication(3);
        int result2 = MathFunc.calculateSomeDivision(5);
        int result3 = MathFunc.calculateSomeMultiplication(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}