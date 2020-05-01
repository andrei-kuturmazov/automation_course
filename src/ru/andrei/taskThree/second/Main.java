package ru.andrei.taskThree.second;

public class Main {
    public static void main(String... args) {

        Flower[] flowers = new Flower[3];
        flowers[0] = new Rose(15, "red");
        flowers[1] = new Peony(10, "pink");
        flowers[2] = new Clove(9, "blue");

        CountByForLoop.getBouquetcountWithForLoop(flowers);
        CountByIterator.getCountByStream(flowers);
        CountByForEach.getCountByForEachLoop(flowers);
    }
}
