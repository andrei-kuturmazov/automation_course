package ru.andrei.taskThree.first;

import java.util.Random;

public class Main {
    public static void main(String... args) {
        int number = new Random().nextInt(1000);
        System.out.println(String.format("Randomly generated number is: %d", number));
        NumberCount.getNumberCount(number);
        HighestDigit.getHighestDigit(number);

    }
}
