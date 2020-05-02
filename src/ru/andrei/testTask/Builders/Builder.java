package ru.andrei.testTask.Builders;

import ru.andrei.testTask.Flowers.Flower;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

public interface Builder {
    void setType(Flower flower);
    void setColor(Color color);
    void setSize(FlowerSize size);
}
