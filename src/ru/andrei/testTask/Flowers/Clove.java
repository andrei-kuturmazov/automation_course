package ru.andrei.testTask.Flowers;

import lombok.Getter;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

@Getter
public class Clove extends Flower {
    private int price = 15;

    public Clove(Color color, FlowerSize size) {
        super(color, size);
    }
}
