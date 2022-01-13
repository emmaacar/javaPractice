package day20_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

public class PracticeSubString {


    public static void main(String[] args) {


        String str ="Selcuk";  //elcu

        String svar = str.substring(1, str.length()-1);
        System.out.println(svar);

        System.out.println("------------------------");
        
        String str1 ="Emel";
        
        String star =str1.substring(1,str1.length()-1);
        System.out.println(star);

        System.out.println("-------------");

        String str2 = "Emel";

        char ne = str2.charAt(3);

        System.out.println(ne);

        System.out.println("---------");

        String str3="Emel Sayinhna";

        int me =str3.length();
        System.out.println(me);
        int be =str3.length()-1;
        System.out.println(be);


        System.out.println("---------------");

        String baba ="Asim";

        String mama=baba.toLowerCase();
        System.out.println(mama);

        String ha=baba.toUpperCase();
        System.out.println(ha);

        System.out.println("=====================");

        String kaka ="   Java Programing Language      ";

        String pupa = kaka.trim();
        System.out.println(pupa);

        System.out.println("=========================");

        String str5 ="Wooden Spoon";
        int stra =str5.indexOf("o");
        System.out.println(stra);

        int pra = str5.indexOf("po"+1);
        System.out.println(pra);

        System.out.println(" = ===========================");

        int lolo =str5.lastIndexOf("o");
        System.out.println("lolo = " + lolo);

        System.out.println("===============================");

        String po ="   ";
        boolean b =po.isEmpty();
        System.out.println("b = " + b);


        System.out.println("===============================");

        String v1 = "JAVA";
        String v2 = new String("JAVA");

        System.out.println(v1==v2);

        System.out.println(v1.equals(v2));

        System.out.println("===============================");

      String sentence = "I love java programing language";
      boolean sentence1 = sentence.contains("love");
        System.out.println(sentence1);

        System.out.println("===============================");

        String he ="wooden spoon";
        boolean we=he.startsWith("wood");
        System.out.println(we);

        boolean so=he.endsWith("wooden");
        System.out.println(we);











        





    }
}
