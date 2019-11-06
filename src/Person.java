public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public Person clone() {
        return new Person(name);
    }
    public boolean equals(Person p2) {
        return name.equals(p2.toString());
    }
}