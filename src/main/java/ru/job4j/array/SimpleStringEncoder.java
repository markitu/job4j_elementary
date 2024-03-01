package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == symbol) {
                counter++;
            } else {
                result += symbol;
                if (counter > 1) {
                    result += counter;
                }
                symbol = current;
                counter = 1;
            }
        }
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}