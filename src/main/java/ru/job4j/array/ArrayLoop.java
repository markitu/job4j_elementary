package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }

        for (int n = 0; n < numbers.length; n++) {
            System.out.println("Значение " + n + " элемента равно: " + numbers[n]);
        }
    }
}