package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple[] appleArray2 = new Apple[135];
        for (int i = 0; i < 135; i++) {
            appleArray2[i] = new Apple();
        }
        Orange[] orangeArray2 = new Orange[90];
        for (int i = 0; i < 90; i++) {
            orangeArray2[i] = new Orange();
        }

        Box<Apple> appleBox1 = new Box<>(new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<>(appleArray2);
        Box<Orange> orangeBox1 = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>(orangeArray2);

        System.out.println("Вес коробки " + appleBox1.getWeight());
        System.out.println("Вес коробки " + appleBox2.getWeight());
        System.out.println("Вес коробки " + orangeBox1.getWeight());
        System.out.println("Вес коробки " + orangeBox2.getWeight());

        System.out.println("------------------");

        System.out.println("Коробки равны? Ответ: " + appleBox1.compare(appleBox2));
        System.out.println("Коробки равны? Ответ: " + appleBox2.compare(orangeBox2));

        System.out.println("------------------");

        System.out.println(appleBox2.getSize() + " и " + appleBox1.getSize());
        appleBox2.appendBox(appleBox1);
        System.out.println(appleBox2.getSize() + " и " + appleBox1.getSize());

        System.out.println("------------------");

        System.out.println(orangeBox1.getSize() + " и " + orangeBox2.getSize());
        orangeBox1.appendBox(orangeBox2);
        System.out.println(orangeBox1.getSize() + " и " + orangeBox2.getSize());
    }
}
