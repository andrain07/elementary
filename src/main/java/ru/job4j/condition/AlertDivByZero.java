package ru.job4j.condition;

public class AlertDivByZero {
    public static void isPossibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        } else if (number < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.isPossibleDiv(4);
        AlertDivByZero.isPossibleDiv(0);
        AlertDivByZero.isPossibleDiv(-1);
    }
}