package lesson4;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Бабин", "+79023214569");
        phonebook.add("Бабкин", "+79029874569");
        phonebook.add("Бабкин", "+79023236979");
        phonebook.add("Бабкин", "+79021452569");
        phonebook.add("Барыкин", "+79089564569");
        phonebook.add("Бисмарк", "+79024753219");
        phonebook.add("Бобин", "+79095146569");
        phonebook.add("Бобин", "+79027894569");
        phonebook.add("Брагин", "+79023657869");

        System.out.println(phonebook.get("Бабкин"));
        System.out.println(phonebook.get("Бисмарк"));
        System.out.println(phonebook.get("Балдин"));
    }
}

