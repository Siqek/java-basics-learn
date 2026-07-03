package collections;

import extra.PersonWithEquals;
import extra.PersonWithoutEquals;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
    public static void test() {
        System.out.println("--- HashSetDemo #1 ---");

        HashSet<Integer> nums1 = new HashSet<>(Arrays.asList(1, 2, 3, 7, 8, 9, 0));
        HashSet<Integer> nums2 = new HashSet<>(Arrays.asList(1, 2, 4, 5, 7, 8, 0));

        System.out.println("First set of nums: ");
        for (Integer n : nums1) {
            System.out.printf("%d ", n);
        }
        System.out.println();

        System.out.println("Second set of nums: ");
        System.out.println(nums2);

        HashSet<Integer> commonNums = new HashSet<>(nums1);
        commonNums.retainAll(nums2);

        System.out.println("Common nums: " + commonNums);

        HashSet<Integer> uniqueNums = new HashSet<>(nums1);
        uniqueNums.addAll(nums2);

        uniqueNums.removeAll(commonNums);

        System.out.println("Unique nums: " + uniqueNums);
    }

    public static void test2() {
        System.out.println("--- HashSetDemo #2 ---");

        System.out.println("-- HashSet<PersonWithoutEquals> --");
        HashSet<PersonWithoutEquals> set1 = new HashSet<>();

        set1.add(new PersonWithoutEquals("John", 22));
        set1.add(new PersonWithoutEquals("John", 22));
        set1.add(new PersonWithoutEquals("Peter", 18));
        set1.add(new PersonWithoutEquals("Peter", 18));
        set1.add(new PersonWithoutEquals("Jack", 37));
        set1.add(new PersonWithoutEquals("Jack", 37));
        set1.add(new PersonWithoutEquals("Zeke", 29));
        final PersonWithoutEquals zeke = new PersonWithoutEquals("Zeke", 29);
        set1.add(zeke);
        set1.add(zeke);
        set1.add(zeke);

        System.out.println("Set1: " + set1);
        System.out.println("Size of set1: " + set1.size());

        System.out.println("-- HashSet<PersonWithEquals> --");
        HashSet<PersonWithEquals> set2 = new HashSet<>();

        set2.add(new PersonWithEquals("John", 22));
        set2.add(new PersonWithEquals("John", 22));
        set2.add(new PersonWithEquals("Peter", 18));
        set2.add(new PersonWithEquals("Peter", 18));
        set2.add(new PersonWithEquals("Jack", 37));
        set2.add(new PersonWithEquals("Jack", 37));
        set2.add(new PersonWithEquals("Zeke", 29));
        final PersonWithEquals zeke2 = new PersonWithEquals("Zeke", 29);
        set2.add(zeke2);
        set2.add(zeke2);
        set2.add(zeke2);

        System.out.println("Set2: " + set2);
        System.out.println("Size of set2: " + set2.size());
    }
}
