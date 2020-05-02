package ru.andrei.testTask.Flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.andrei.testTask.Colors.Color;
import ru.andrei.testTask.Size.FlowerSize;

@AllArgsConstructor
@Getter
public class Flower {

    private Color color;
    private FlowerSize size;


    @Override
    public String toString() {
        return "Flower{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}
