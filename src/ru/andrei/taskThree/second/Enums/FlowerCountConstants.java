package ru.andrei.taskThree.second.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.andrei.taskThree.second.Flowers.Flower;

import java.util.Arrays;
import java.util.Iterator;

@Getter
@AllArgsConstructor
public enum FlowerCountConstants {

    FOR_EACH("Bouquet price by forEach loop %d"),
    FOR_I("Bouquet price by for loop is %d"),
    ITERATOR("Bouquet price by iterator is %d");

    private String description;

    public static int getCountByForEachLoop(Flower... flowers) {
        int count = 0;
        for (Flower flower : flowers) {
            count += flower.getPrice();
        }
        return count;
    }

    public static int getCountByForLoop(Flower... flowers) {
        int count = 0;
        for (int i = 0; i < flowers.length; i++) {
            count += flowers[i].getPrice();
        }
        return count;
    }

    public static int getCountByIterator(Flower... flowers) {
        Iterator<Flower> iterator = Arrays.asList(flowers).iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count += iterator.next().getPrice();
        }
        return count;
    }

}
