package ru.andrei.testTask.Flowers;

import lombok.Getter;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

@Getter
public class Peony extends Flower {

    private int price = 25;

    public Peony(Color color, FlowerSize size) {
        super(color, size);
    }
}
