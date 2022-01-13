package day30_CustomClass;

public class CatObject {

    public static void main(String[] args) {

        Cat cat1 =new Cat();

        cat1.name =" Cato";
        cat1.age = 5;
        cat1.color = "white";
        cat1.gender ='M';
        cat1.bread = "Persion";
        cat1.size = "Medium";

        Cat cat2 = new Cat();

        cat2.name ="Sarman";
        cat2.age = 5;
        cat2.color = "Yellow";
        cat2.gender = 'M';
        cat2.bread =" Tekir";
        cat2.size = "Small";

        Cat cat3 = new Cat();

        cat3.name = "Komur";
        cat3.age = 3;
        cat3.color = "black";
        cat3.gender = 'F';
        cat3.bread ="Tekir";
        cat3.size = "Big";

        Cat cat4 = new Cat();
       cat4.setInfo("Mavi",5,"Yellow",'F',"Tekir","small");

        System.out.println();



    }
}
