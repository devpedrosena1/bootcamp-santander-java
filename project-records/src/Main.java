public class Main {
    public static void main(String[] args) {

        var person = new Person("Pedro");
        System.out.println(person);
        System.out.println(person.getInfo());

        var newPerson = new Person(person.name());
        System.out.println(newPerson);
        System.out.println(newPerson.getInfo());

    }
}
