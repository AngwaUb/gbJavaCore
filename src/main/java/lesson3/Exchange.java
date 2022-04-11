package lesson3;

import java.util.Arrays;

public class Exchange {
    public static void swapTwoElements(Object[] array, int x, int y) {
        System.out.println("Исходный массив: " + Arrays.toString(array));
        if ((x >= 0) && (y >= 0) && (x < array.length) && (y < array.length)) {
            Object tempValue = array[x];
            array[x] = array[y];
            array[y] = tempValue;
            System.out.println("Измененный массив: " + Arrays.toString(array) + "\n");
        } else {
            System.out.println("Обмен элементов с индексами " + x + " и " + y + " невозможен\n");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'П', 'Р', 'И', 'В', 'Е', 'Т'};
        String[] strArray = {"Коля ", "любит ", "Олю "};

        swapTwoElements(intArray, 1, 3);
        swapTwoElements(intArray, 1, 7);
        swapTwoElements(doubleArray, 2, 0);
        swapTwoElements(charArray, 1, 4);
        swapTwoElements(charArray, -1, 3);
        swapTwoElements(strArray, 0, 2);
    }

}
