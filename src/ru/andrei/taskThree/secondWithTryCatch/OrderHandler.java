package ru.andrei.taskThree.secondWithTryCatch;

import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerColor;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerSize;
import ru.andrei.taskThree.secondWithTryCatch.flowers.Clove;
import ru.andrei.taskThree.secondWithTryCatch.flowers.Flower;
import ru.andrei.taskThree.secondWithTryCatch.flowers.Peony;
import ru.andrei.taskThree.secondWithTryCatch.flowers.Rose;

import java.util.List;

public class OrderHandler {

    public static FlowerColor returnColor(String input) {
        FlowerColor color = null;
        switch (input) {
            case ("red"):
                color = FlowerColor.RED;
                break;
            case ("white"):
                color = FlowerColor.WHITE;
                break;
            case ("purple"):
                color = FlowerColor.PURPLE;
                break;
        }
        return color;
    }

    public static FlowerSize returnFlowerSize(String input) {
        FlowerSize flowerSize = null;
        switch (input) {
            case ("high"):
                flowerSize = FlowerSize.HIGH;
                break;
            case ("middle"):
                flowerSize = FlowerSize.MIDDLE;
                break;
            case ("small"):
                flowerSize = FlowerSize.SMALL;
                break;
        }
        return flowerSize;
    }

    public static Flower returnFlower(String flowerType, String flowerColor, String flowerSize ) {
        Flower flower = null;
        switch (flowerType) {
            case("rose"):
                flower = new Rose(returnColor(flowerColor), returnFlowerSize(flowerSize));
                break;
            case ("peony"):
                flower = new Peony(returnColor(flowerColor), returnFlowerSize(flowerSize));
                break;
            case ("clove"):
                flower = new Clove(returnColor(flowerColor), returnFlowerSize(flowerSize));
                break;
        }
        return flower;
    }

    public static int returnOrderCount(List<Flower> flowers) {
        int count = 0;
        for (Flower flower: flowers) {
            count += flower.getPrice();
        }
        return count;
    }
}
