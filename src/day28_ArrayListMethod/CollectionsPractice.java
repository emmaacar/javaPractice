package day28_ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers =new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 200, 50, 150, 10, 20, 30, 40, 50, 60, 70));
        System.out.println(numbers);

        // sort
        Collections.sort(numbers);

        System.out.println(numbers);
        System.out.println("---------------");

        // min max
        Integer max = Collections.max(numbers);    // Integer a verible etmek
       Integer min = Collections.min(numbers);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-----------------");

        // reverse
        Collections.reverse(numbers);
        System.out.println(numbers);

        System.out.println(" --------------------------");

        // swap
        Collections.swap(numbers,1, 2);

        System.out.println(numbers);

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println("-------------------");

        numbers.addAll(Arrays.asList(50,50,50 ));
        System.out.println(numbers);
        
        int count = Collections.frequency(numbers,50);
        System.out.println("count = " + count);






    }
}
