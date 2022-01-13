package Interview1;

public class Applearing {

    public static void main(String[] args) {


        int[] arr = {1, 5, 7, 9, 5, 3, 4, 6, 5};
        int number = 5;
        int coun2 = 0;

        for (int each : arr) {
            if (each == number) {
                coun2++;

            }

        }
        System.out.println("coun2 = " + coun2);

    }
}