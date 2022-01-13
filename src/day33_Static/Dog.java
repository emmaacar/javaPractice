package day33_Static;

public class Dog {

    public String breed,size,color;
    public char gender;
    public int age;

    public Dog(String breed, String size, String color, char gender) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.gender = gender;


    }
    public static int numberOfLegs=4;
    public static int numberOfEyes=2;
    public static int numberOfWings=0;
    public static boolean isFriendly;

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
    public void eat(){
        System.out.println(breed+"is eating");
    }
    public void sleep(){
        System.out.println(breed+"is sleeping");
    }
    public void play(){
        System.out.println(breed +" is playing");

    }

    /*
1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()


     */
}
