package day36_Inheritance;

public class SubClassObjects {
    
    public static void main(String[] args) {


        Iphone iphone = new Iphone();

        iphone.setInfo("Iphone","x5","plus",12356,"rose");
        iphone.text(125678125);
        iphone.call(2557777);
        iphone.faceTime("emelsayinhan@hotmail.com");
        iphone.faceTime(25845555);
        System.out.println("iphone = " + iphone);


        Samsung samsung = new Samsung();
        
        samsung.setInfo("samsung","galaxsi","big",75822,"pink");
        samsung.freeze();
        samsung.text(1522222);
        System.out.println("samsung = " + samsung);


        Nokia nokia = new Nokia();
        
        nokia.setInfo("Nokia","FV","small",125847,"White");
        nokia.selfDefense();
        nokia.call(155555544);

        System.out.println("nokia = " + nokia);


    }
}