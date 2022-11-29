package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!isEmpty(name) && isLowerLatinLetter(name.codePointAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                result = isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)
                        || isDigit(code);
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }

    public static boolean isDigit(int code) {
        return Character.isDigit(code);
    }

    public static boolean isEmpty(String s) {
        return s.isEmpty();
    }
}