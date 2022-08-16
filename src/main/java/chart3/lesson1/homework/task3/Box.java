package chart3.lesson1.homework.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Box<E extends Fruit> {
    private ArrayList<E> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void putOneMoreFruit(E... fruit){
        fruits.addAll(Arrays.stream(fruit).toList());
    }

    public float getWeightOfBox(){
        float weightOfBox = 0.0f;
        for (E item : fruits)
            weightOfBox += item.getWeight();
        return weightOfBox;
    }

    public boolean compare(Box o) {
        return this.getWeightOfBox() == o.getWeightOfBox();
    }

    public void pourOverInto(Box<E> box){
        fruits.forEach(item -> box.putOneMoreFruit(item));
        fruits = new ArrayList<>();
    }
}
