package day30_CustomClass;

public class Cat {

    public String name;
    public int age;
    public String color;
    public char gender;
    public String bread;
    public String size;

    public Cat() {

    }
   

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void eat(){   // statik dersen tum cediler yer ve miyavlar.
        System.out.println(name+" is eating");

    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public void setInfo(String name, int age, String color, char gender, String bread, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.bread = bread;
        this.size = size;
    }


    }

/*
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */




