package day21_Arrays;

import java.util.Arrays;

public class ArraysEquals {

    public static void main(String[] args) {

        int[] list1 = {1, 5, 52};
        int[] list2 = {1, 5, 52};
        int[] list3 = {1, 5, 53};

        System.out.println(Arrays.equals(list1,list2));
        System.out.println(Arrays.equals(list2,list3));


    }
}
