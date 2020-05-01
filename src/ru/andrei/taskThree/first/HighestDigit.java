package ru.andrei.taskThree.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Написать программу, выводящую на экран случайно сгенерированное трехзначное натуральное число и его наибольшую цифру
 */
public class HighestDigit {
    public static void getHighestDigit(int number) {
        List<Integer> numbers = getNumbersAsList(number);
        System.out.print("Highest number is ");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(System.out::println);
    }
    public static List<Integer> getNumbersAsList(int number) {
       List<Integer> numbers = new ArrayList<>();
       while(number != 0) {
           numbers.add(number % 10);
           number /= 10;
       }
       return numbers;
    }

}
