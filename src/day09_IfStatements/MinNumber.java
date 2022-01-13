package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        /*
        n1 & n2  print minimum number ?
       */
        int n1 = 100;
        int n2 = 200;

        if(n1<n2){
            System.out.println(n1+" minimum number");

            if(n2<n1){
                System.out.println(n2+" minimum number");

                if(n1==n2){
                    System.out.println("equal");

                }
            }

        }

    }
}
