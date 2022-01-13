package day14_string;

public class StringMethod {

    public static void main(String[] args) {


        String str1 ="   batch 25     ";
        str1 = str1.trim();
        System.out.println( str1);

        String str2 ="Cydeo School";
        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);
        
        int n2 =str2.indexOf("ool");
        System.out.println("n2 = " + n2);
        
        String str3 ="Java Programing language";
        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        String s = "Java Nova Cava Wawa orange";

          int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);
        
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("");

    }





}
