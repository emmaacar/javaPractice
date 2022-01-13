package day37_Inheritance.ScrumTask;

public class BusnessAnalyst extends Employee{

    public BusnessAnalyst(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
    public void analyze(){
        System.out.println(name+" "+jobTitle+" is analysing");
    }
}
