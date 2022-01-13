package day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        int a = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = a++;
        }
        System.out.println(Arrays.toString(numbers));

        // bilmiyorsak new yazip icine yazicaz[100]
        // biliyorsak {20,10,30} gibi suslu parantez acip icine giricez


        System.out.println("=======================================");

        int[] num = new int[100];
        int b = 100;
        for (int i = 0; i < num.length; i++) {
            num[i] = b--;

        }
        System.out.println(Arrays.toString(num));

        System.out.println("=======================================");


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Number");
        int length = scan.nextInt();
        int[] nums = new int[10];
        int s = 10;
        for (int i = 0; i < num.length; i++) {
            nums[i] = scan.nextInt();  //10

        }

        scan.close();




    }

    }

        /*
        Tasks:
    1. create an array that has the numbers 1 to 100
    2. create an array that has the numbers 100 to 1
    3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
  */














