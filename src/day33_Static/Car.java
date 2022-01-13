package day33_Static;

public class Car {

    public String brand,model,color;
    public int year;
    public double price;

    public static int numberOfWheels;
    public static boolean hasBattery;
    public static boolean hasSeats;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){
        System.out.println("I m driving"+ brand +" "+ model);


    }


    /*
    1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()




     */
}
