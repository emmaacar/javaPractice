package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {


    public static void main(String[] args) {

        String[]emel ={"kalem","kalemtras","kalem kutu"};
        System.out.println(Arrays.toString(emel));


        System.out.println("============================");

        int[]numara ={5,1,3,4,2,0};

        System.out.println(Arrays.toString(numara));

        Arrays.sort(numara);
        System.out.println(Arrays.toString(numara));

        System.out.println("============================");

        char[] em ={'a','b','c'};
        char[] em1 ={'b','a','c'};

        System.out.println(em==em1);
        System.out.println(Arrays.equals(em,em1));

        Arrays.sort(em1);
        System.out.println(Arrays.equals(em,em1));


        System.out.println("============================");

        int[]score = {45, 55, 65, 75, 85};

        int[]score1 =Arrays.copyOf(score,8);


        System.out.println("============================");

        char[]elements ={'A','B','C','D','E'};












    }
}
