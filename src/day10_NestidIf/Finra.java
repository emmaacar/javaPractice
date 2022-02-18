package day10_NestidIf;

public class Finra {

    public static void finra (){

        for (int i = 1; i < 100; i++) {
            if (i % 15 ==0) {
                System.out.println("Finra");
            }else if(i % 5 == 0) {
                System.out.println("Fin");
            }else if (i % 3 == 0) {
                System.out.println(" ra");
            }else{
                System.out.println(i+" ");

            }

        }

    }

    public static void main(String[] args) {
        finra();

    }
}
