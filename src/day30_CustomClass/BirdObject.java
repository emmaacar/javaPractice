package day30_CustomClass;

public class BirdObject {

    public static void main(String[] args) {

       Bird bird1 = new Bird();

       bird1.name ="Watermelon";
       bird1.age =2;
       bird1.gender ='F';
       bird1.size ="medium";
       bird1.bread ="green chakanier";
       bird1.color = "Green";

       Bird bird2 =new Bird();

       bird2.name ="boncuk";
       bird2.age =6;
       bird2.gender ='M';
       bird2.size ="small";
       bird2.bread = "serce";
       bird2.color ="blue";

       
       Bird bird3 = new Bird();

       bird3.setInfo("mavi","serce",6,'F',"big","sari");


       System.out.println("bird2 = " + bird2);
       System.out.println("bird1 = " + bird1);
       System.out.println("bird3 = " + bird3);

       bird1.eat();

       bird2.fly();


    }
}
