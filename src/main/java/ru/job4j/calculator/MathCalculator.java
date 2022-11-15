package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double sumOfAllCalculations(double first, double second) {
        return minus(first, second)
                + sum(first, second)
                + divide(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Итог сложения результата всех "
               + "вычислений равен " + sumOfAllCalculations(10, 20));
        System.out.println("Итог сложения результатов "
                + "вычитания и деления двух числе равен " + minusAndDivide(10, 20));
    }

}