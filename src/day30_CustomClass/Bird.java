package day30_CustomClass;

public class Bird {

    public String name;
    public String bread;
    public int age;
    public String size;
    public char gender;
    public String color;

    public void setInfo(String birdName,String birdBread, int birdAge, char birdGander, String birdSize, String birdColor ){

        name = birdName;
        bread = birdBread;
        size = birdSize;
        color =birdColor;
        age =birdAge;
        gender =birdGander;
    }

    public void eat(){
        System.out.println(name +" is eat ");
    }

    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }

    public void fly(){
        System.out.println(name +" fly ");


    }

    }

/*
attributes:
name,age,gender,color,size

Action:  (methot  demek)  == hepsine farkli
eat(), play(), bark()....
 */
