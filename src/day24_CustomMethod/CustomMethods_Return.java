package day24_CustomMethod;

public class CustomMethods_Return {
    public static void main(String[] args) {

        int total =sum(20 ,40)*3;
        System.out.println(total);

        System.out.println("===================");

        String S1 =reverse("Wooden Spoon");
        System.out.println(S1);

        System.out.println("===================");
        System.out.println(isPalindrome("Anna") );
    }

    public static int sum(int num1, int num2) {

        int result =num1+num2;

        return result;

    }

    public static String reverse(String str) {
        String result ="";

        for (int i =str.length()-1;i >0;i--) {
            result +=str.charAt(i);

        }
        return result;

        }

        public static boolean isPalindrome(String str) {

            String reversed = reverse(str);

            return reversed.equalsIgnoreCase(str);
    }
}












