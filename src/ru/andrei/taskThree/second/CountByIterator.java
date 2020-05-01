package ru.andrei.taskThree.second;

import java.util.Arrays;
import java.util.Iterator;

public class CountByIterator {

    public static void getCountByStream(Flower... flowers) {
        Iterator<Flower> iterator = Arrays.asList(flowers).iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count += iterator.next().getPrice();
        }
        System.out.println(String.format("Bouquet price by iterator is %d", count));
    }
}
