package day31_Constructors;

public class Carpet {
    public double width, length, unitPrice;
    public  boolean isPerson;

    public Carpet(double width, double length, double unitPrice, boolean isPerson) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPerson = isPerson;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPerson=" + isPerson +
                ", total price of carpet= $" + calcCost() +
                '}';
    }


    public void  customOrder(){
        System.out.println("width" +"length"+"unitPrice"+"isPerson" );
    }
    public  double calcCost(){
        double totalPrice =(width*length)*unitPrice;
        if (isPerson){
            totalPrice+=200;
        }
        return  totalPrice;

    }

}
/*
Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice



 */