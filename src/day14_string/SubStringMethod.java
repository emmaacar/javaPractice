package day14_string;

import javax.lang.model.SourceVersion;

public class SubStringMethod {
    public static void main(String[] args) {


        // subString(begIndex): substring olusturuyor vermis oldugun undex numarasindan itibaren bitis kelimesine kadar tum cumleyi kapsiyor.
        // * yeni birstring olusturacagimiz icin tekrar String olusturupyeni bi isim verip eski isme asigne etmen gerekiyor.( cunki unmituble)
        // * String olarak donuyor.
        String str ="Java Programing Language"; // P harfinden sonraki cumleyi almak icin
        String result1 =str.substring(str.indexOf("P"));
        System.out.println( result1);

        // subString(begIndex, endIndex):baslangici ve substrini bitirmek istedigin noktanin indexin veriyorsun
        // * tam olarak bitis index numarasinide versen son karakteri saymiyor.o yuzden + 1 vermek zorundasin
        // * string olarak doner
        String result2 = str.substring(str.indexOf("P"),str.lastIndexOf(" "));
        System.out.println(result2);


        // repeat(N) : tekrarlayarak yazmak istedigin kelimeyi kac kez yazmak istersen repeat i kullanip tekrar sayisini parantezin icine giriyorsun.
        // * string olarak doner
        String mesela = "EMEL";
        String yeni = mesela.repeat(2);
        System.out.print(yeni);


    }
}
