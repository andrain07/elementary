package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char previousSymbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != previousSymbol) {
                result.append(counter > 1 ? String.valueOf(previousSymbol) + counter : previousSymbol);
                previousSymbol = input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        result.append(counter > 1 ? String.valueOf(previousSymbol) + counter : previousSymbol);
        return result.toString();
    }
}