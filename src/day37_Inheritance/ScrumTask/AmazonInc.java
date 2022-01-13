package day37_Inheritance.ScrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        ProducktOwner po =new ProducktOwner("emel",25,'M',"QA",158,4587888,"Company");

        BusnessAnalyst ba = new BusnessAnalyst("kazim",54,'F',"sdet",15,15268,"Bank of Amerika");

        ScrumMuster sm =new ScrumMuster("Lale",29,'M',47859,123654,"Chase");




        Tester tester1 =new Tester("Emel",37,'F',"QA",12963,2250000,"Company");

        Tester tester2 =new Tester("selim",39,'F',"QA",178,1110000,"Company");

        Tester tester3 =new Tester("sami",33,'F',"QA",189,2150000,"Company");

        Tester tester4 =new Tester("riza",31,'F',"QA",158,230000,"Company");

        Tester[]testers={tester1,tester2,tester3,tester4};

        Developer developer = new Developer("musa",54,'M',"Java developer",58,98567,"Company") ;




    }
}
