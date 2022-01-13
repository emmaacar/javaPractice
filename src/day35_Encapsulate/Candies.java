package day35_Encapsulate;

public class Candies {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {

            this.quantity = quantity;
        }

        }
        public double getPrice () {
            return price;

        }

        public void setPrice ( double price){
            if (price <= 0) {
                this.price = price;
            }
        }

        public boolean isHasPeanuts () {
            return hasPeanuts;
        }

        public void setHasPeanuts ( boolean hasPeanuts){
            this.hasPeanuts = hasPeanuts;
        }
    }

    /*
    1.1 Create a custom class named Candy
private variables:
brand (String), quantity (int), price (double),
hasPeanuts (boolean)
Encapsulate All the private fields
(price of candy can not be set to negative)
(quantity of candy can not be set to zero or
negative)
Add a constructor that allows user to set all the fields
when the object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
toString():
if the price is zero, print "free" instead of 0
1.2 Create a class named CandyFactory
Create an ArrayList of candies
Add five objects of candies
use for each loop to print the brand and price of each
candy


     */
