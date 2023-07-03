package ru.job4j.converter;

import java.util.Locale;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int rubles = 121;
        float dollars = rubleToDollar(rubles);
        System.out.printf(Locale.US, "%d rubles are %.2f euro.", rubles, dollars);
    }
}