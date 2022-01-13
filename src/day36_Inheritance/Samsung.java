package day36_Inheritance;

public class Samsung extends Phone {

    public void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling ");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting ");
    }
    public void freeze(){
        System.out.println(model+" call freezing ");
    }


    }

    /*
    Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()


     */

