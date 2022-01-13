package day31_Constructors;

public class Item {


    public String name;
    public double unitePrice;
    public int quantity;

    public Item(String name, double unitePrice, int quantity) {
        this.name = name;
        this.unitePrice = unitePrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", unitePrice=" + unitePrice +
                ", quantity=" + quantity +
                ",total price $" + calcCost()+
                '}';
    }

    public double calcCost(){
        return unitePrice* quantity;
    }
    /*
    	4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()


     */
}
