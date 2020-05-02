package ru.andrei.taskThree.secondWithTryCatch;

import ru.andrei.taskThree.secondWithTryCatch.OrderHandler;
import ru.andrei.taskThree.secondWithTryCatch.enums.StringConstants;
import ru.andrei.taskThree.secondWithTryCatch.flowers.Flower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List <Flower> flowerBouquet = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(StringConstants.USER_INVITATION.getDescription());
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int flowerCount = Integer.parseInt(reader.readLine());

            for (int i = 0; i < flowerCount; i++) {
                System.out.println(StringConstants.FLOWER_SELECTION.getDescription());
                String flowerType = reader.readLine().trim().toLowerCase();
                String flowerColor = reader.readLine().trim().toLowerCase();
                String flowerSize = reader.readLine().trim().toLowerCase();
                flowerBouquet.add(OrderHandler.returnFlower(flowerType, flowerColor, flowerSize));
            }
            System.out.println(flowerBouquet);
            System.out.print(StringConstants.BOUQUET_COUNT.getDescription() + " " + OrderHandler.returnOrderCount(flowerBouquet));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
