package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        if (name.length() > 0 && isLowerLatinLetter(name.codePointAt(0))) {
                for (int i = 0; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (!isSpecialSymbol(code) && !isUpperLatinLetter(code)
                            && !isLowerLatinLetter(code) && !Character.isDigit(code)) {
                        result = false;
                        break;
                    }
                }
        } else {
            result = false;
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}