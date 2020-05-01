package ru.andrei.taskThree.second;

import ru.andrei.taskThree.second.Enums.FlowerCountConstants;
import ru.andrei.taskThree.second.Flowers.*;

public class Main {
    public static void main(String... args) {

        Flower[] flowers = new Flower[3];
        flowers[0] = new Rose(15, "red");
        flowers[1] = new Peony(10, "pink");
        flowers[2] = new Clove(9, "blue");

        System.out.println(String.format(FlowerCountConstants.FOR_EACH.getDescription(), FlowerCountConstants.getCountByForEachLoop(flowers)));
        System.out.println(String.format(FlowerCountConstants.FOR_I.getDescription(), FlowerCountConstants.getCountByForLoop(flowers)));
        System.out.println(String.format(FlowerCountConstants.ITERATOR.getDescription(), FlowerCountConstants.getCountByIterator(flowers)));
    }
}
