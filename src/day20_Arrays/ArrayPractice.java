package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {


    public static void main(String[] args) {


        String[] days ={"mon","thus","wed","thur","fri","sat","sun"};
        System.out.println(Arrays.toString(days));

        int num = 1;

       if (num <1 || num >7) {

           System.err.println("invalid number");
           System.exit(0);
       }
        System.out.println(days[num-1]);

        }

        }

