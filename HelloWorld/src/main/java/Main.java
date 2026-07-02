import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Greeter greeter = null;

    public static void main(String[] args) {

        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Want to introduce yourself? [yes/no]");
        String userInput = tryToReadBufferedReader(r);

        if (userInput == null) {
            System.out.println("Something went wrong.");
            return;
        }

        if (userInput.equalsIgnoreCase("yes")) {
            System.out.print("Enter your name: ");
            userInput = tryToReadBufferedReader(r);
            if (userInput == null) {
                System.out.println(("Something went wrong."));
            }

            greeter = new PersonGreeter(userInput);
        } else if (userInput.equalsIgnoreCase("no")) {
            System.out.println("You don't want to introduce yourself, that's OK.");
        } else {
            System.out.println("Unexpected input - let's assume the input was 'no'.");
            System.out.println("See 'Hello World' instead.");
            greeter = new HelloWorld();
        }

        if (greeter != null) {
            greeter.sayHello();
        }
    }

    private static String tryToReadBufferedReader(BufferedReader r) {
        try {
            return r.readLine();
        } catch (Exception e) {
            return null;
        }
    }
}
