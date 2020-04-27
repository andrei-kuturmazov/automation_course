package ru.andrei.taskTwo;

import lombok.Getter;
import lombok.Setter;
import ru.andrei.taskTwo.interfaces.Eating;
import ru.andrei.taskTwo.interfaces.Running;
import java.util.Objects;

@Getter
@Setter
public class Cat implements Running, Eating {
    private String name;
    private int age;
    private int weight;
    private String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format
                ("My name is %s, I'm %d years old. I prefer to eat a lot of food, so my weight is %d kg, also I'm very pretty, cuz my breed is %s.", name, age, weight, breed);
    }

    @Override
    public void eating() {
        System.out.println(String.format("I'm eating a lot, because, I'm %d years old", age));
    }

    @Override
    public void running() {
        System.out.println("I'm running so fast, look at me");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                weight == cat.weight &&
                name.equals(cat.name) &&
                breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, breed);
    }
}
