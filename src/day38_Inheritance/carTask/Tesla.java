package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }


    @Override
    public void start() {
        super.start();
    }

    public void autoPilot() {
        System.out.println(brand + model + " in auto pilot mode");

    }


    }
