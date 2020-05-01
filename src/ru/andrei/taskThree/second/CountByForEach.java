package ru.andrei.taskThree.second;

public class CountByForEach {

    public static void getCountByForEachLoop(Flower... flowers) {
        int count = 0;
        for (Flower flower: flowers) {
            count += flower.getPrice();
        }
        System.out.println(String.format("Bouquet price by forEach loop %d", count));
    }
}
