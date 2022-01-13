package day14_string;

public class Practice4 {

    public static void main(String[] args) {

        for (char ch = 'A'; ch <='D' ; ch++) {
            if (ch=='C'){
                continue;
            }
            System.out.println(ch  +" ");
            if (ch=='B'){
                break;
            }

        }
    }
}
