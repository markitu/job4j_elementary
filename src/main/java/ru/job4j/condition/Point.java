package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 5, 7, 9);
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(11, 5, 17, 3);
        double result3 = Point.distance(4, 10, 10, 4);

        System.out.println("result (3, 5) to (7, 9) equals " + result);
        System.out.println("result (0, 0) to (2, 0) equals " + result1);
        System.out.println("result (11, 5) to (17, 3) equals " + result2);
        System.out.println("result (4, 10) to (10, 4) equals " + result3);
    }
}