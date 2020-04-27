package ru.andrei.taskOne.classes;

import ru.andrei.taskOne.interfaces.BuilderInterface;

public class Director {
    public void returnHomeCat (BuilderInterface builder) {
        builder.setAge(5);
        builder.setBreed("British");
        builder.setColor("grey");
        builder.setHomeless(false);
        builder.setSize("Normal");
    }

    public void returnHomelessCat (BuilderInterface builder) {
        builder.setAge(1);
        builder.setBreed("Mixed");
        builder.setColor("black");
        builder.setHomeless(true);
        builder.setSize("Tiny");
    }

    public void returnWildCat (BuilderInterface builder) {
        builder.setAge(4);
        builder.setBreed("Bengal Tiger");
        builder.setColor("striped");
        builder.setHomeless(true);
        builder.setSize("Huge");
    }
}
