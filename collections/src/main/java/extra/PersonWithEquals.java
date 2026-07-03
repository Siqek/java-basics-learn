package extra;

public class PersonWithEquals extends PersonWithoutEquals {
    public PersonWithEquals(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;

        PersonWithEquals other = (PersonWithEquals)object;
        return this.age == other.age && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;

        for (int i = 0; i < name.length(); ++i) {
            hash = hash * 31 + name.charAt(i);
        }

        return hash * age;
    }
}
