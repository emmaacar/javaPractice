package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);

       
        int[] name= new int[nums.length];

        for (int i = name.length - 1; i >= 0; i--) {
        }


            System.out.println(Arrays.toString(nums));
            


        System.out.println("=========================");
        
        int[]score ={95,100,55,65,85,78};
        Arrays.sort(score);

        System.out.println(Arrays.toString(score));

        System.out.println(score [1]);




    }
}
