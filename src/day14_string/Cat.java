package day14_string;

public class Cat {

    public static void main(String[] args) {

        String s1 ="Cat";
        String s2="Cat";
        String s3= new String("Cat");

        System.out.println(s1 == s2);
        System.out.println(s1== s3);

        System.out.println(" = =============");

        String s5 ="Java";
        String s7 = s5.replace("a","e");
        System.out.println(s7);


    }
}
