package day30_CustomClass;

import java.util.ArrayList;

public class Iterating {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));

            System.out.println(" ============================= ");

            // index numarasi kullanmiyorsun each loopta. revers yapamazsin.

            for (Integer each : numbers) {
                System.out.println(each);

            }

        }

        }

    }



