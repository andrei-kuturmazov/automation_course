package ru.andrei.taskThree.second;

public class CountByForLoop {

    public static void getBouquetcountWithForLoop(Flower... flowers) {
        int sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            sum += flowers[i].getPrice();
        }
        System.out.println(String.format("Bouquet price by for loop is %d", sum));
    }
}
