package ru.job4j.condition;

public class Cinema {
    public static void hasAccess(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.hasAccess(21);
        Cinema.hasAccess(16);

    }
}