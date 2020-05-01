package ru.andrei.taskThree.second;

import ru.andrei.taskThree.second.Flowers.Flower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static ru.andrei.taskThree.second.Enums.StringConstants.FLOWERS_COUNT_INPUT;

public class MainWithTryCatch {

    private static List<Flower> flowers;

    public static void main(String... args) {

        System.out.println(FLOWERS_COUNT_INPUT.getDescription());
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int flowerCount = Integer.parseInt(reader.readLine().trim());
            flowers = new ArrayList<>(flowerCount);
            for(int i = 0; i <= flowerCount; i++) {

            }

        }
        catch (IOException e) {

        }
    }
}
