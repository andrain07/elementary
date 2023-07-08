package ru.job4j.condition;

public class ComputerClub {
    public static void checkPermission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        ComputerClub.checkPermission(true, true);
        ComputerClub.checkPermission(true, false);
        ComputerClub.checkPermission(false, true);
        ComputerClub.checkPermission(false, false);
    }
}