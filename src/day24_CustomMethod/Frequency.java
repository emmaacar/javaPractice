package day24_CustomMethod;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5, 4, 4, 4};
        int result = frequency(arr, 4);

        System.out.println(result);
    }

        public static int frequency(int[] arr, int num) {
            int frequency = 0;
            for (int each : arr) {
                if (each == num) {
                    frequency++;
                }
            }
            return frequency;
        }
    }
    /*
    create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
     */




