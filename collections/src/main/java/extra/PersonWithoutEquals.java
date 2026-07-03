package extra;

public class PersonWithoutEquals {
    public final String name;
    public final int age;

    public PersonWithoutEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("n: %s, a: %d", name, age);
    }
}
