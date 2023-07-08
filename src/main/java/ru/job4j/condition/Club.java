package ru.job4j.condition;

public class Club {
    public static void checkPermission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        checkPermission(true, true);
        checkPermission(true, false);
        checkPermission(false, true);
        checkPermission(false, false);
    }
}