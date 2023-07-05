package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1) {
            return false;
        }

        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}