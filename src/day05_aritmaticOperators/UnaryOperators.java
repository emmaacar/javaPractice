package day05_aritmaticOperators;

import javax.lang.model.SourceVersion;

public class UnaryOperators {
    public static void main(String[] args) {

          //unary plus operator && unary minus operator
        int a = +50;
        int b = -20;

        boolean aIsPositiveNumber = a > 0;
        boolean bIsNegativeNumber = b < 0;
        System.out.println(aIsPositiveNumber);
        System.out.println(bIsNegativeNumber);




         // Pre Increment ( artmasi) && Pre Decrement ( azalmasi )
          int f = 10;
        System.out.println(++f);
          int o = 5;
        System.out.println(--o);


        int x = 10;
        System.out.println(++x);
        int z = 10;
        System.out.println(--z);






        //Post Increment &  Post Decrement

        int y =10;
        System.out.println(y--);
        System.out.println(y);

        int q =100;
        System.out.println(q++);
        System.out.println(q);

        int d = 20;
        int v = -30;

        boolean dIsPositiveNumber = d>0;
        boolean vIsNegativeNumber = v<0;
        System.out.println(dIsPositiveNumber);
        System.out.println(vIsNegativeNumber);

        boolean sonuc =10<8;
        System.out.println(sonuc);

        boolean elma =10<=10;
        System.out.println(elma);

        System.out.println("---------------");







    }
    }



