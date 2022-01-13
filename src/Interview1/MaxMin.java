package Interview1;

public class MaxMin {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 6, 8, 9, 1, 1, 25, 89, 22};

        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {

            if (each > max) {
                max = each;
            }

            if (each < min) {
                min = each;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println(" = ==============================");

        int[] numberss = {10, 7, 8, 8, 9, 9, 50, 25, 89, 22};
        int minimum = numberss[0];
        int maximum = numberss[0];

        for (int each : numberss) {

            if (each < minimum) {
                minimum = each;

            }
            if (each > maximum) {
                maximum = each;

            }

        }
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);

        System.out.println(" = ============================");

        int[] numberella = {10, 20, 89, 78, 5, 33, 44, 42};

        int max1 = numberella[0];
        int min1 = numberella[0];

        for (int each : numberella) {

            if (each > max1) {
                max1 =each;
            }
            if (each < min1){
                min1 =each;
            }
        }
        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);
    }
}











