public class PersonGreeter implements Greeter {
    String name = null;

    public PersonGreeter(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello, %s!%n", name == null ? "" : name);
    }
}
