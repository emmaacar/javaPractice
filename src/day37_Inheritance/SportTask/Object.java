package day37_Inheritance.SportTask;

public class Object {
    public static void main(String[] args) {

        Football football=  new Football("Emel",5,4," You can not touch with your hand");

        Basketball basketball =new Basketball("Celil",5,4," You can see just tree yellow cart.");

        Baseball baseball1 =new Baseball("Umut",7,2," Each team has need catcher");

        AmericanFootball americanFootball = new AmericanFootball("Yesim",12,6," mast be wear helmet ");

        System.out.println("americanFootball = " + americanFootball);
        System.out.println("baseball1 = " + baseball1);
        System.out.println("football = " + football);
        System.out.println("basketball = " + basketball);



    }

}
