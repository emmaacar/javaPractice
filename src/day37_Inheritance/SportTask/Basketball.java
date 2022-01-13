package day37_Inheritance.SportTask;

public class Basketball extends Sport{


    public Basketball(String name, int numberOfPlayer, int numberOfRefere, String rules) {
        super(name, numberOfPlayer, numberOfRefere, rules);
    }

    public void smach() {
        System.out.println(numberOfPlayer+" is smaching");

    }
    public void foul(){
        System.out.println(numberOfPlayer+" is made foul");
    }
    public void  yellowCart(){
        System.out.println(numberOfPlayer+name+" is toke yallow cart");
    }

}
