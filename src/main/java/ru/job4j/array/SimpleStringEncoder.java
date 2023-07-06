package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char currentSymbol;
        boolean isLastSymbol;
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            isLastSymbol = i == input.length() - 1;
            currentSymbol = input.charAt(i);
            if (isLastSymbol || currentSymbol != input.charAt(i + 1)) {
                result.append(currentSymbol);
                if (counter > 1) {
                    result.append(counter);
                }
                counter = 1;
            } else {
                counter++;
            }
        }

        return result.toString();
    }
}