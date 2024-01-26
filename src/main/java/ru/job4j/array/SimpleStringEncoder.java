package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        if (input.length() == 1) {
            return input;
        }
        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) == input.length()) {
                if (counter == 1) {
                    result = result + input.charAt(i);
                } else {
                    result = result + input.charAt(i) + counter;
                }
                break;
            }
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter = counter + 1;
            } else {
                if (counter == 1) {
                    result = result + input.charAt(i);
                } else {
                    result = result + input.charAt(i) + counter;
                }
                counter = 1;
            }
        }
        return result;
    }
}