package day36_Inheritance.Employe;

public class Objects {

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setInfo("Emel",'F',36,12458,"Developer",1258810);

        Driver driver =new Driver();
        driver.setInfo("Kazim",'M',45,789,"Driver",1547836);

        Teacher teacher = new Teacher();
        teacher.setInfo("Mahmut",'F',30,1458," Teacher",157893);

        Tester tester =new Tester();
        tester.setInfo("Dilek",'F',25,789,"Teacher",982456);

        System.out.println( tester);

        System.out.println( teacher);

        System.out.println( driver);

        System.out.println( developer);


    }
}
