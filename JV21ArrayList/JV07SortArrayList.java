//package JV21ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JV07SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();

        numbers.add(33);
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);

        names.add("Jitendra");
        names.add("Jiten");
        names.add("jitu");
        names.add("Rishabh");
        names.add("Adarsh");

        System.out.println(numbers);
        System.out.println();
        System.out.println(names);
        System.out.println();

        Collections.sort(numbers);  // Sort numbers
        Collections.sort(names);  // Sort numbers

        for (int i : numbers) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println();

        System.out.println(names);
    }
}
