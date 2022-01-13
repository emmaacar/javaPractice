package day24_CustomMethod;

public class CustomMethod_Parameters {

    public static void main(String[] args) {

       displayValue(12);
    }

    public static void displayValue(int number){
        System.out.println("The value is:"+number);

        System.out.println("=======================");

        eligibleToVote(21 ,false);

        System.out.println("=======================");

        oddOrEven(215  );


    }

    public static void eligibleToVote(int age , boolean isUSACitizen){

        if (age >=18 && isUSACitizen) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");





        }


    }




    public static void oddOrEven(int number){


        if(number % 2==0) {
            System.out.println("Is even number");
        }else{
            System.out.println("is odd number");




        }

    }

    }
