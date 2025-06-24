public record Person(String name, int age) {

    // todo atributo declarado no record é privado e final

    public Person {

    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " Age: " + age;
    }


}
