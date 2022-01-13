package day12_Scanner;

import java.util.Arrays;

public class MoveAllZerosTheEnd {
    public static void main(String[] args) {


        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result = new int[array.length];  //{0,0,0,0,0,0}

        int i = 0;
        for (int each : array) {
            if (each!= 0){
                result[i] = each;
                        i++;
            }

        }
        System.out.println(Arrays.toString(result));

    /*
    Ex:
    array={10,05,0,1,0};

    output ={10,5,1,0,0,0}
    sifirlari sil sonundan
     */
    }
}