package interviewQuestion;

public class Finra {

    public static void finra(int num ) {

        for (int i = 0; i <= 100; i++) {
            if ( i % 15 == 0){
                System.out.print("finra " );
            }
            if (i % 3== 0){
                System.out.print("fin ");
            }
            if (i %5 == 0){
                System.out.print("ra ");
            }else{
                System.out.print( i+" ");
            }

        }
    }

    public static void main(String[] args) {
     finra(5);
    }
}
