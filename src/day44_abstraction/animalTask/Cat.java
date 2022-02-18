package day44_abstraction.animalTask;


import day44_abstraction.Animal;

public class Cat extends Animal {
    public Cat(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");

    }
    public void meow(){
        System.out.println(getName()+" is  mowing");
    }
}
