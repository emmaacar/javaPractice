package day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int years;
    public double price;

    public void setInfo(String carBrand, String carModal, String carColor, int carYears, double carPrice){
        brand =carBrand;
        model = carModal;
        color = carColor;
        years = carYears;
        price = carPrice;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", years=" + years +
                ", price=" + price +
                '}';


    }
    
    public  void start(){
        System.out.println(" has starded " + brand+model);


    }
    public void stop(){
        System.out.println("has stoped");
    }


    public void drive(){
        System.out.println("Driving  " + brand+ " "+model);
        
        
    }

}

