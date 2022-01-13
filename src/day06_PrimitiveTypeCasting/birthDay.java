package day06_PrimitiveTypeCasting;

public class birthDay {
    public static void main(String[] args) {

         // casting : bir degeri digerine donusturmek. inti double gibi.
        // in a =10;
        // double b ;
        //  int a =(double)b; cevirmek istedigimiz degerin soluna parantez acip neye cevirek istiyorsak onu yazicaz

        String name = "John";
        int birthday = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name+ " was born on " + birthMonth +"/"+birthday+"/"+birthYear+".");
    }
}

  /*
name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;
			 	output:
			 		John was born on April/25/1995.
Primitives:
double > float > long > int > short > byte

	smaller primitives can be directly assigned to larger primitive type
	larger ptimitives can NOT be directly assigned to smaller primitive types (need to be casted manually)

   */





