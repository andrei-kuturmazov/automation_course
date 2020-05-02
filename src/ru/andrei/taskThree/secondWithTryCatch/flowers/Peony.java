package ru.andrei.taskThree.secondWithTryCatch.flowers;

import lombok.Getter;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerColor;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerSize;


@Getter
public class Peony extends Flower {

    private final int price;

    public Peony(FlowerColor color, FlowerSize size) {
        super(color, size);
        this.price = 15;
    }

    @Override
    public String toString() {
        return String.format("Peony with following attributes: color: %s; size: %s", super.getFlowerColor(), super.getFlowerSize());
    }
}
