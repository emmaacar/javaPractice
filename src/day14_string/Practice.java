package day14_string;

import javax.lang.model.SourceVersion;

public class Practice {

    public static void main(String[] args) {
        String str ="Wooden Spoon";
        str = str.replace("o","a");
        System.out.println("str = " + str);
        
        String str1 ="EMEL ACAR";
        str1=str1.replaceFirst("E","A");
        System.out.println("str1 = " + str1);;


        String name ="xcode";
        String mama = name.replace("x","a");
        System.out.println(mama);
    }
}
