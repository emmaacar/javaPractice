package day33_Static;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Boston Terier","medium","Brown White",'F');
        System.out.println(dog1);
        dog1.eat();
        dog1.play();
        dog1.sleep();

    }
}
