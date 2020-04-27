package ru.andrei.taskOne.classes;

public class Main {
    public static void main(String... args) {
        Director director = new Director();
        CatBuilder builder = new CatBuilder();
        director.returnHomeCat(builder);
        Cat homeCat = builder.getCat();
        System.out.println("Our new cat is: " + homeCat.getBreed());
        homeCat.meowing();
    }
}
