package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota =new Toyota("Raw 4",2008,25000,"White",150000);

        Tesla tesla =new Tesla("model s",2022,80000,"Black",20000);

        BMW bmw = new BMW("X5",2011,89000,"black",120000);

        toyota.start();
        tesla.start();
        bmw.start();



    }
}
