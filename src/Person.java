public class Person {

    public static void changePerson (Person person) {
        Person person1 = new Person("Ilya", "Lagutenko");
        System.out.println("person = " + person);
    }
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Автор книги: " +
                name + " " + surname;

    }



















}
