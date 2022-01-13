package day14_string;

import javax.lang.model.SourceVersion;

public class StringMethodPart1 {
    public static void main(String[] args) {
        //charAt (int index):s
        String str = "emel";
                   // 0123
        // * her bir rakam index numarasini temisil ediyor.Index herzaman 0 dan baslar
        // * index numarasini cagirdigimda karsiligi olan harfi yollar yani donusumu char olur.


        System.out.print(str.charAt(0));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(0));
        System.out.print(str.charAt(3));

        System.out.println("---------------------");

        // length(): // toplamda kactane harf (karakter) varsa integar degerini verir.
        // * index number daima 0 dan basladigi icin bir eksik cikar.intigar ise tam.
        // emel acar int :9
        //emel acar index :8
        String str1 = "Emel Acar";
        int num = str1.length();
        System.out.println(num);
        int lastIndex = str1.length()-1;  // 0 dan basladigi icin index numarasini bulurken mutlaka -1 olucak
        System.out.println(lastIndex);

        System.out.println("---------------------------");

        // toLowerCase() : stringdeki tum objenin tamamini kucuk harfe ceviriyor.Aslinda unmutible yani degistirilemez
        // * oldugu gibi kaydeder. Degistirmiyor yeni bir sting obje olusturuyor.Bu yuzden string name (assign)baglayacaksin edeceksin
        // * donusu string olacak

        String str2 ="EmeL";
        str2 = str2.toLowerCase(); // "emel" //eski objeyi yenisine asigne etmessen yeni objeyi print etmez
        System.out.println(str2);

        System.out.println("-------------------");

       //toUpperCase(): string objelerin tamammini buyuk harfe ceviricek.
        // * eski objeyi yenisine asigne etmessen yeni objeyi print etmez
        // * donusu string olucak.
        String str3 = "java";
        str3 = str3.toUpperCase();
        System.out.println("str3 = " + str3);

        System.out.println("-----------------");

        //trim(): string  texi basinda ve sonunda olan beyaz kisimlari temizliyor.
        // * kelime aralarindaki bosluklari degil.iki kelime arasinda uzun bosluk varsa trim etmez.
        // * eski objeyi yenisine asigne etmessen yeni objeyi print etmez
        // * string olarak donuyor.

        String str4 = "     Emel Sayinhan  Acar         ";
        str4 = str4.trim();
        System.out.println( str4);

        System.out.println("----------------------------");
        
        //indexOf(): ilk karakterin index numarasini veriyor.
        // * eger 2. o harfini bulmak istersen harfi ozellestirmen gerek yani yanindaki karakteri ekleyebilirsin.
        // * integer olarak donuyor.

        String str5 ="Wooden Spoon";
        int indexNumberOfFirstO = str5.indexOf("o");
        System.out.println("indexNumberOfFirstO = " + indexNumberOfFirstO);

        int indexNumberOfSecondO = str5.indexOf("od");
        System.out.println("indexNumberOfSecondO = " + indexNumberOfSecondO);

        int indexNumberThirdO = str5.indexOf("oon");
        System.out.println("indexNumberThirdO = " + indexNumberThirdO);

        System.out.println("---------------------------------------");

        // lastIndexOf(): en sondaki ayni olan karakterin index numarasini verir.
        // * int olarak doner
        String str6 ="Wooden Spoon";
        int indexNumberOfLastO = str6.lastIndexOf("o");
        System.out.println("indexNumberOfLastO = " + indexNumberOfLastO);
                
        

        







    }
}
