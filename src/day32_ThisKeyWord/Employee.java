package day32_ThisKeyWord;

public class Employee {
    public String name;
    public char gender;
    public String jobTile;
    public double salary;


    public Employee(String name, char gender, String jobTile, double salary){
        this.name = name;
        this.gender =gender;
        this.jobTile = jobTile;
        this.salary =salary;

    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTile='" + jobTile + '\'' +
                ", salary=" + salary +
                '}';
    }

}
