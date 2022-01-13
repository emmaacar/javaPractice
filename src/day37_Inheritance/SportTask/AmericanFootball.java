package day37_Inheritance.SportTask;

public class AmericanFootball extends Sport{

    public AmericanFootball(String name, int numberOfPlayer, int numberOfRefere, String rules) {
        super(name, numberOfPlayer, numberOfRefere, rules);

    }
    public void routes(){
        System.out.println(numberOfPlayer+" is routing");
    }
}
