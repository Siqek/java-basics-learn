package collections;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    final static String someText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since 1966";

    public static void test() {
        System.out.println("--- TreeSetDemo #1 ---");

        TreeSet<String> uniqueWords = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        uniqueWords.addAll(List.of(someText.split("\s+")));

        System.out.printf("There are %d unique words in the text.%n", uniqueWords.size());

        System.out.println(uniqueWords);
    }
}
