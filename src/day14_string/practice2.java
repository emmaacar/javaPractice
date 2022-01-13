package day14_string;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("pleas enter the tex");
 
        String input = scan.nextLine();
        int charCount =input.length();
        System.out.println("charCount = " + charCount);

        scan.close();
        System.out.println(" = ========================");

        String word="Good";

        char firstChar=word.charAt(0);
        System.out.println("firstChar = " + firstChar);

        System.out.println(" = ===========================");


        }
      
        
    }

