package day27_ArrayList;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {


        //       nonpremetif olmak zorunda array
        ArrayList<Integer> list = new ArrayList<Integer>(); // prematif deta tipe yazamazsin in premetiv kullanacaksin<Integer>

        list.add(10);  // add method 10 u inti yani Integer a ceviriyor unboxing 10 objekt olarak array list a ekleniyor
        list.add(10);  // arrayList duplicate ekleyebilirsin
        list.add(10);  // herdefasinda inkreas eder

        System.out.println(list);
        System.out.println(list.size());
    }
}