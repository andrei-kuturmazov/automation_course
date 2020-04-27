package ru.andrei.taskOne.classes;

import lombok.Setter;
import ru.andrei.taskOne.interfaces.BuilderInterface;

@Setter
public class CatBuilder implements BuilderInterface {
    private String breed;
    private int age;
    private String color;
    private String size;
    private boolean homeless;

    public Cat getCat() {
        return new Cat (breed, age, color, size, homeless);
    }
}
