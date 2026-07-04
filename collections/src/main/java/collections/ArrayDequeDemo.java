package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void test() {
        final String correctlyClosedBrackets = "([{}([][])]{()[()]{}})";
        final String incorrectlyClosedBrackets = "([]([)]{}()";

        System.out.println("Correctly closed brackets: " + correctlyClosedBrackets);
        System.out.println("\tresult: " + validateBracketClosure(correctlyClosedBrackets));

        System.out.println("Incorrectly closed brackets: " + incorrectlyClosedBrackets);
        System.out.println("\tresult: " + validateBracketClosure(incorrectlyClosedBrackets));

        final String incorrectBrackets = "(()";
        System.out.println("Incorrectly closed brackets: " + incorrectBrackets);
        System.out.println("\tresult: " + validateBracketClosure(incorrectBrackets));

        final String incorrectBrackets2 = ")()";
        System.out.println("Incorrectly closed brackets: " + incorrectBrackets2);
        System.out.println("\tresult: " + validateBracketClosure(incorrectBrackets2));
    }

    private static boolean validateBracketClosure(String strBrackets) {
        ArrayDeque<Character> brackets = new ArrayDeque<>();

        for (Character c : strBrackets.toCharArray()) {
            switch (c) {
                case '(':
                    brackets.addLast(')');
                    break;
                case '[':
                    brackets.addLast(']');
                    break;
                case '{':
                    brackets.addLast('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (brackets.isEmpty()) {
                        return false;
                    }
                    Character removedBracket = brackets.removeLast();
                    if (removedBracket != c) {
                        return false;
                    }
            }
        }

        return brackets.isEmpty();
    }
}
