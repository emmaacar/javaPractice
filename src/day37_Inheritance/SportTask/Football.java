package day37_Inheritance.SportTask;

import day37_Inheritance.ScrumTask.Person;

public class Football extends Sport{

    public Football(String name, int numberOfPlayer, int numberOfRefere, String rules) {
        super(name, numberOfPlayer, numberOfRefere, rules);

    }
    public void defens(){
        System.out.println(name+numberOfPlayer+" is defensing ");
    }
}
