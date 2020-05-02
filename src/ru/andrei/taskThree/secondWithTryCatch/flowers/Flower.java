package ru.andrei.taskThree.secondWithTryCatch.flowers;

import lombok.Getter;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerColor;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerSize;

@Getter
public class Flower {

    private FlowerColor flowerColor;
    private FlowerSize flowerSize;
    private int price;

    public Flower(FlowerColor flowerColor, FlowerSize flowerSize) {
        this.flowerColor = flowerColor;
        this.flowerSize = flowerSize;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color=" + flowerColor.getDescription() +
                ", size=" + flowerSize.getDescription() +
                '}';
    }
}
