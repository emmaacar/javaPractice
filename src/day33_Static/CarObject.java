package day33_Static;

public class CarObject {

    public static void main(String[] args) {
        Car car1 =new Car("Tesla ","a4","White",2020,100000);
        System.out.println(car1);

        car1.drive();
    }
}
