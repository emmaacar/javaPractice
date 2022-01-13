package day37_Inheritance.SportTask;

import java.io.OutputStream;

public class Baseball extends Sport{

    public Baseball(String name, int numberOfPlayer, int numberOfRefere, String rules) {
        super(name, numberOfPlayer, numberOfRefere, rules);
    }
    public void homeRun(){
        System.out.println(name+numberOfPlayer+" is runing for home run");
    }
    public void cetch(){
        System.out.println(name+numberOfPlayer+" is catching the ball");
    }
}
