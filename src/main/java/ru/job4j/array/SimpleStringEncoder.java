package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char currentSymbol = '\0';
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            currentSymbol = input.charAt(i);
            if (currentSymbol != input.charAt(i + 1)) {
                result.append(currentSymbol);
                if (counter > 1) {
                    result.append(counter);
                }
                counter = 1;
            } else {
                counter++;
            }
        }

        char lastSymbol = input.charAt(input.length() - 1);
        if (currentSymbol == lastSymbol) {
            result.append(currentSymbol);
            if (counter > 1) {
                result.append(counter);
            }
        } else {
            result.append(lastSymbol);
        }

        return result.toString();
    }
}