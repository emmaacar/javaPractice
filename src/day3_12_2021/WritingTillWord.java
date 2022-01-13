package day3_12_2021;

public class WritingTillWord {


    public static void main(String[] args) {

/**
 * 1.
 *                                 Given a non-empty string like "Code" print a string like below output.
 *                                 (do with substring  first)
 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 *                                 (do with charAt())
 *                                 Code → "C-Co-Cod-Code"
 *                                 abc → "a-ab-abc"
 *                                 ab → "a-ab"
 */


            //0123
            String word="Code";
/*
    String c=word.substring(0,1);
    System.out.println("c = " + c);
    String co=word.substring(0,2);
    System.out.println("co = " + co);
    String cod= word.substring(0,3);
    System.out.println("cod = " + cod);
    String code= word.substring(0,4);
    System.out.println("code = " + code);
 */

   String var=word.substring(0);
        System.out.println("var = " + var);

            for (int i = 0; i <=word.length() ; i++) {
                String tem=word.substring(0,i);
                System.out.print( tem);
            }


        }
    }


