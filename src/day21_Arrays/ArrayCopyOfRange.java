package day21_Arrays;

import java.util.Arrays;

public class ArrayCopyOfRange {


    public static void main(String[] args) {

        int[] liste = {1, 4, 5, 11, 15,22, 33,66,67,68,75};

        int[] copyArray= Arrays.copyOf(liste,2);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray =Arrays.copyOfRange(liste,0,3);
        System.out.println(Arrays.toString(copyOfRangeArray));








    }
}
