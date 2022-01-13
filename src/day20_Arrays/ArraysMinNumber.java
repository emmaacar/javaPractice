package day20_Arrays;

public class ArraysMinNumber {

    public static void main(String[] args) {

        int[] name = new int [100];
        int min =name[0];

        for (int i = name.length - 1; i >= 0; i--) {  // i indek numarasini temisl ediyor v
                          //java soldan saga calistigi icin ilk indek numarasini karsilastiriyor.

            if(name[i]< min){
              min =name[i];

            }
        }
        System.out.println("min = " + min);
    }
}
