package day31_Constructors;

public class Salary {

    public double hourlyRate, stateTaxRate, federal, weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federal, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federal = federal;
        this.weeklyHours = weeklyHours;
    }


    public String toString() {
        return "Address{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federal=" + federal +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public  void salary() {
        double calcSalary = hourlyRate * weeklyHours * 52;
    }
    public void stateTax(){

    }

}


    /*

1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */

