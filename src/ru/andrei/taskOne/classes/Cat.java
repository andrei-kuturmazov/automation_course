package ru.andrei.taskOne.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.andrei.taskOne.interfaces.Eating;
import ru.andrei.taskOne.interfaces.Meowing;
import ru.andrei.taskOne.interfaces.Sleeping;

@Getter
@AllArgsConstructor
public class Cat extends Animal implements Meowing, Eating, Sleeping {

    private String breed;
    private int age;
    private String color;
    private String size;
    private boolean homeless;

    @Override
    public void eating() {
        System.out.println("I'm eating delicious food");
    }

    @Override
    public void meowing() {
        System.out.println("Meowing all the time");
    }

    @Override
    public void sleeping() {
        System.out.println("Sleeping all day long");
    }
}
