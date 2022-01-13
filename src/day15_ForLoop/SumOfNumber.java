package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) ;
            System.out.print(i + " ");

        }
        System.out.println("----------------");
        for (int i = 1; i < 100; i++) {
            if(i % 2 !=0){
                System.out.print(i+" ");
                  scan.close();
        }

        }
    }
}
/*
  1.  Write a program that can return the sum of even numbers between 1 to 100

   2. Write a program that can return the sum of odd numbers between 1 to 100
 */
