package collections;

import java.util.*;

public class ArrayListDemo {
    public static void test() {
        System.out.println("--- ArrayListDemo #1 ---");

        List<String> cars = new ArrayList<String>(Arrays.asList("Dodge", "Ford"));
        cars.addFirst("Volvo");
        cars.add("Mercedes-Benz");
        cars.add(2, "Opel");
        cars.set(2, "Saab");

        System.out.printf("There are %d cars.%n", cars.size());

        String car100 = "";
        try {
            car100 = cars.get(100);
        } catch (Exception _) {
            car100 = "no car found";
        }

        System.out.printf("Car with index=1 is: %s.%n", cars.get(1));
        System.out.printf("Car with index=100 is: %s.%n", car100);

        System.out.println("Cars are: ");
        for (int i = 0; i < cars.size(); ++i) {
            System.out.printf("\t%d. %s%n", i + 1, cars.get(i));
        }

        cars.remove(2);

        if (cars.contains("Dodge")) {
            System.out.println("There is Dodge in the list.");
        } else {
            System.out.println("There is no Dodge in the List");
        }

        if (cars.contains("Saab")) {
            System.out.println("There is Saab in the list.");
        } else {
            System.out.println("There is no Saab in the List");
        }

        System.out.printf("There are %d cars now.%n", cars.size());

        System.out.println("Let's see the cars one more time.");

        int num = 1;
        for (String car : cars) {
            System.out.printf("\t%d. %s%n", num++, car);
        }

        cars.clear();

        System.out.println("And one more time.");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.printf("%d cars left.%n", cars.size());
    }

    public static void test2() {
        System.out.println("--- ArrayListDemo #2 ---");

        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(
           1, 2, 9, 6, 7, 3, 4, 5, 3, 2, 6, 7, 4, 3, 2, 9, 7, 8, 2, 3, 0, 1, 2
        ));

        System.out.println("nums: " + nums);

        for (int i = 0; i < nums.size(); ++i) {
            final int n = nums.get(i);
            final int firstIndexOfN = nums.indexOf(n);
            int lastIndexOfN = nums.lastIndexOf(n);
            while (lastIndexOfN != firstIndexOfN) {
                nums.remove(lastIndexOfN);
                lastIndexOfN = nums.lastIndexOf(n);
            }
        }

        System.out.println("unique nums: " + nums);

        Collections.sort(nums);

        System.out.println("unique sorted nums: " + nums);
    }
}
