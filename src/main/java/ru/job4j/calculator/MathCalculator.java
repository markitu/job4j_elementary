package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат subtractAndDivide равен: " + subtractAndDivide(55, 5));
        System.out.println("Результат sumAndMultiplyAndSubtractAndDivide равен: " + sumAndMultiplyAndSubtractAndDivide(100, 50));

    }

    public static double subtractAndDivide(double first, double second) {
        return MathFunction.subtract(first, second)
                + MathFunction.divide(first, second);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second) {
        return sumAndMultiply(first, second) + subtractAndDivide(first, second);
    }
}