package ru.andrei.testTask.Flowers;

import lombok.Getter;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

@Getter
public class Rose extends Flower {

    private int price = 30;

    public Rose(Color color, FlowerSize size) {
        super(color, size);
    }

    @Override
    public String toString() {
        return String.format("U've successfully select Rose with following attributes: color: %s; size: %s", super.getColor(), super.getSize());
    }
}
