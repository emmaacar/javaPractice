package day20_Arrays;

public class ArrayMaxNumber {


    public static void main(String[] args) {

        // 2. find the max number

        int[] bum = {10, 20, 80, 700, 500, 2};
        int max = bum[0];
        for (int i = 0; i < bum.length; i++) {

            if (bum[i] > max) {
                max = bum[i];

            }

        }
        System.out.println(max);

        System.out.println("=============================");

        int[]nums ={1,2,3,4,5,6,78,6,2,0,150,12,25,};

        int mex = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>max){
                max = nums[i];

        }

        }
        System.out.println(max);


    }
}