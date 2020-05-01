package ru.andrei.taskThree.first;

/**
 * Написать программу выводящую на экран случайно сгенерированное трехзначное натуральное число и сумму его цифр
 */
public class NumberCount {

    public static void getNumberCount(int number) {
        int numberSum = 0;
        while (number != 0) {
            numberSum += (number % 10);
            number /= 10;
        }
        System.out.println(String.format("Numbers count is %d", numberSum));
    }
}
