package Interview1;

public class Frequency {

    public static void main(String[] args) {

     /*
        String str = "laptoptopl";
        char lathers = 'p';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (lathers == str.charAt(i)) {
                frequency++;
            }
        }
        System.out.println(frequency);

        */

        String str1 = "loopiiiiiiiikkkgg";

        char harf = 'i';
        int frequency = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (harf == str1.charAt(i)) { // yani harf str1 daki harflerin index numarasina gidip bakacak (i)
                frequency++;

            }
        }
        System.out.println("frequency = " + frequency);

        System.out.println(" = =============================");

        String str3 = "lommopiinniipppikkkgg";

        int bu = 0;
        char ne = 'n';

        for (int i = 0; i < str3.length(); i++) {

            if (ne == str3.charAt(i)) {
                bu++;

            }
        }
        System.out.println(bu);


    }

}