package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStoreToNumber {

    public static void main(String[] args) {

       Scanner scan =new Scanner(System.in);

       //  1. store all user entered numbers in an array



        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {

            System.out.println("Enter number");
            num[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(num));

        scan.close();
    }
}
