package ru.verlonar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        split();

	    //начальный массив
        int[] arr = generateRandomArray();

        //задание 1
        System.out.println("Сумма трат за месяц составила " + IntStream.of(arr).sum() + " рублей");

        split();

        //задание 2
        System.out.println("Минимальная сумма трат за день составила " + IntStream.of(arr).min().getAsInt() + " рублей. " +
                            "Максимальная сумма трат за день составила " + IntStream.of(arr).max().getAsInt() + " рублей");

        split();

        //задание 3
        System.out.println("Средняя сумма трат за месяц составила " + IntStream.of(arr).average() + " рублей");

        split();

        //задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        split();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void split() {
        System.out.println("-------------------------------------------");
    }
}
