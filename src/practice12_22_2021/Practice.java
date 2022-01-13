package practice12_22_2021;

public class Practice {
    public static void main(String[] args) {


        int a = 0;
        do {
            a =a++ + --a -(a % 3);

        }while (++a < 4);

        System.out.println(a);

    }


    }

