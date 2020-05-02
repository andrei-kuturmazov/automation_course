package ru.andrei.testTask.Builders;

import lombok.AllArgsConstructor;
import lombok.Data;

import ru.andrei.testTask.Flowers.Flower;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

@AllArgsConstructor
@Data
public class FlowerBuilder implements Builder {
    private Flower flower;
    private Color color;
    private FlowerSize size;

    @Override
    public void setType(Flower flower) {
        this.flower = flower;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setSize(FlowerSize size) {
        this.size = size;
    }

    public Flower getOrderedFlower() {
        return new Flower (color, size);
    }
}

