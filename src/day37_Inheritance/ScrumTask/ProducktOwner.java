package day37_Inheritance.ScrumTask;

public class ProducktOwner extends Employee{

    public ProducktOwner(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
    public void getRequerimet() {
        System.out.println(jobTitle+" "+name+" is requearing ");

    }

}
