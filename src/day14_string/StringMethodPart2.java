package day14_string;

public class StringMethodPart2 {
    public static void main(String[] args) {

        // replace : (eski degeri yeni degerle degistiriyor) ayni olan tum karakterleri yeni verilen karaktere ceviriyor
        // * string olarak donuyor
        // * yeni objeyi eski objeye asign etmek zorundasin
        String str1 = "Wooden Spoon";
        str1 =str1.replace("o","e");
        System.out.println("str1 = " + str1);
        
        // * sadece harf degil istersen cumledeki kelimeleride degstirebilirsin
        String sentence ="i love Java,Java is the best programing language";
        sentence = sentence.replace("Java","emel");
        System.out.println("sentence = " + sentence);

         //replaceFirst: cumledeki ayni olan ilk kelimeyi yeni kelimeyle degistiriyor
        // * eger tekrar eski objeyi(Java) cagirmak istersen bu defa (emel) eski deger,yeni deger)oldValue, newValue

       String str2 = "i love Java,Java is the best programing language";
        sentence = sentence.replaceFirst("emel","Java");
        System.out.println("sentence = " + sentence);

        System.out.println("-------------------------------");




        

    }
}
