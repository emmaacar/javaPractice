package day05_aritmaticOperators;

public class ShortHandOperators {

    public static void main(String[] args) {
         // assignment
        int a = 5;
        a = 10;
        System.out.println(a);

        int b = 50;
        b = 1;
        System.out.println(b);
        int c = 3;
        c = 1;
        System.out.println(c);

        // additional assignment

        int m = 5;        // increases the value by 1
        m += 1;
        System.out.println(m);

        int z = 90;       // increases the value by 50
        z += 50;
        System.out.println(z);

        // subtraction assignment  -
        int s = 70;                //decreases the value by 50
        s -= 50;
        System.out.println(s);

        int k =10;                 // decreases the value by 5
        k-=5;
        System.out.println(k);

          // multiplication assignment +

        int h = 50;              // multiplies the value by 5
         h *= 5;
        System.out.println(h);

        int o = 100;      // multiplies the value by 2
        o *= 2;
        System.out.println(o);

        // Division assignment    *

        int w =100;       // division the value by 5
        w /= 5;
        System.out.println(w);

        //  Remainder assignment   %

        int l =200;     // remainder of 200 divided by 10
        l %= 10;
        System.out.println(l);

        int p = 60;    // remainder of 60 divided by 8
        p %= 8;
        System.out.println(p);
    }


}
