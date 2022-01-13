package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        //  3. Write a program that asks user to enter a number 10 times:

        Scanner scan =new Scanner(System.in);

        System.out.println("enter your number");

        int em= scan.nextInt();
        int[] ema = new int[5];
        int emas=5;

        for (int i = 1; i <ema.length; i++) {

            ema[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(ema));
        scan.close();
    }
    }

