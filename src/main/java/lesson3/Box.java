package lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box(T... x) {
        this.box = new ArrayList<T>();
        Collections.addAll(this.box, x);
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public double getWeight() {
        return box.size() * box.get(0).getWeightInstance();
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void appendBox(Box<T> another) {
        another.getBox().addAll(box);
        box.clear();
    }

    public int getSize() {
        return box.size();
    }
}
