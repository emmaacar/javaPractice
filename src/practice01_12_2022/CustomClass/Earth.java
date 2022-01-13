package practice01_12_2022.CustomClass;

public class Earth {

    public static void main(String[] args) {
        
        AnimalSpecies dogs =new AnimalSpecies();
        dogs.growthRate=5;
        dogs.name ="Angel";
        dogs.population=50;
        
        dogs.setInfo(5,"Angel",50);  // set seting yapiuor
        System.out.println(dogs.getGrowthRate());  //  get method burada getiriyor yazacagini
        System.out.println("dogs = " + dogs);
        
    }
}
