package day27_ArrayList;

public class Practice2 {

    public static void main(String[] args) {


        int[] arr = {1, 5, 7, 9, 5, 3, 4, 6, 5};

        int num = 5;
        int count1 = 0;

        for (int each : arr) {
            if (each == num) {
                count1++;

            }
        }
            System.out.println(count1);
        }



}

