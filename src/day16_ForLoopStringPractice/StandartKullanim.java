package day16_ForLoopStringPractice;


public class StandartKullanim {

    public static void main(String[] args) {
        int number = 0;

        System.out.print("\ni: ");   //* println dersen alt alta siraliyor print dersen yanyana siraliyor.
        for (int i = 0; i < 10; i++) { //* " " bosluk birakmaktaki neden print ederken rakamlar arasinda bosluk birakmak
            System.out.print(i+" ");

        }
        System.out.print("\nl: ");
        for (int l = 10; l >= 0; l--) {
            System.out.print(l+" ");
        }
        System.out.print("\nk: ");
        for (int k = 5; k <=10; k++) {
            System.out.print(k+" ");
        }
        System.out.print("\nm: ");
        for (int m = 0; m <= 100; m+=10) {
            System.out.print(m+" ");
        }
        System.out.print("\nf: ");
        for (int f = 50; f >= 0; f-=5) {
            System.out.print(f+" ");
        }
        System.out.println("\nson cikis : ");
        for (int s = 0; s <= 50; s+=3) {
            System.out.print(s+" ");

        }
        }
        }







