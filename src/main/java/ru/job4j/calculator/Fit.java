package ru.job4j.calculator;

public class Fit {
    private static final double MAN_HEIGHT_OFFSET = 100;
    private static final double WOMAN_HEIGHT_OFFSET = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        return (height - MAN_HEIGHT_OFFSET) * WEIGHT_COEFFICIENT;
    }

    public static double womanWeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        return (height - WOMAN_HEIGHT_OFFSET) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        double height = 187;
        double manWeight = Fit.manWeight(height);
        double womanWeight = Fit.womanWeight(height);
        System.out.println("Ideal weight for a man with height " + height + " cm is " + manWeight + " kg");
        System.out.println("Ideal weight for a woman with height " + height + " cm is " + womanWeight + " kg");
    }
}