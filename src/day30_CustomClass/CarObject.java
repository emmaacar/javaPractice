package day30_CustomClass;

public class CarObject {
    public static void main(String[] args) {

      Car car1 = new Car();
      car1.setInfo("Infiniti","QA","White",2019,35000.0);

        System.out.println(car1);

        Car car2  = new Car();
        car2.setInfo("Toyota","Raw","White",2000,15000);

        System.out.println(car2);

        Car car3 =new Car();

        car3.setInfo("Honda","Civik","black",2003,8000);

        System.out.println(car3);




    }
}
