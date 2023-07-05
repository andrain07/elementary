package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Sherlock Holmes";
        names[2] = "Dr. Watson";
        names[3] = "Mycroft Holmes";
        System.out.println("ages length: " + ages.length);
        System.out.println("surnames length: " + surnames.length);
        System.out.println("prices length: " + prices.length);
        System.out.println(names[0] + '\n' + names[1] + '\n' + names[2] + '\n' + names[3]);
    }
}
