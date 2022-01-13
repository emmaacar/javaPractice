package day18_WhileLoop;

public class Practice1 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("Merhaba Emel");
            i++;



            //  1’den 20’ye kadar olan tam sayıların toplamı:

            int toplam = 0;
            int a = 0;
            while (a < 20) {
                toplam = toplam + a;
                System.out.println("toplam :"+toplam);
                i++;


            }
        }
    }
}
