package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }
        phonebook.get(name).add(phone);

    }

    public String get(String name) {
        if (phonebook.containsKey(name)) {
            return name + ": " + phonebook.get(name).toString();
        } else {
            return name + ": Сведения отсутствуют.";
        }
    }
}
