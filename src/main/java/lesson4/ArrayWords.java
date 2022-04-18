package lesson4;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayWords {
    public static void main(String[] args) {
        String[] arrayWords = {
                "Абрикос", "Ананас", "Апельсин", "Апельсин", "Арбуз", "Арбуз", "Банан",
                "Груша", "Груша", "Дыня", "Капуста", "Картофель", "Картофель", "Картофель",
                "Лук", "Лук", "Лук", "Лук", "Морковь", "Морковь", "Огурец", "Свекла"
        };

        System.out.println(Arrays.toString(arrayWords));

        HashMap<String, Integer> dictionary = new HashMap<>();

        for (String key : arrayWords) {
            if (dictionary.containsKey(key)) {
                dictionary.put(key, dictionary.get(key) + 1);
            } else {
                dictionary.put(key, 1);
            }
        }

        System.out.println(dictionary);

    }
}

