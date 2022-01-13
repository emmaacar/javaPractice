package day05_aritmaticOperators;

import javax.lang.model.SourceVersion;

public class UnaryPractice {
    public static void main(String[] args) {


        int a = -100;
        int b = +200;
        boolean aIsNegative = a < 0;
        boolean bIsNegative = b < 0;
        System.out.println(bIsNegative);
        System.out.println(aIsNegative);
        int x =20;
        System.out.println(++x);
        System.out.println(x);
        int p = 10;
        System.out.println(--p);

        int z =20;
        System.out.println(z++);
        System.out.println(z);

        int q =100;
        System.out.println(q--);
        System.out.println(q);

        // addition assignment
        int e = 50;
        e -=20;
        System.out.println(e);

        int m = 80;
        m +=40;
        System.out.println(m);

        int s =12;
        s *= 5;
        System.out.println(s);




    }
}
