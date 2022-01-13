package day23_CostomMethod_Void;

public class CustomMethodParameter {
    public static void main(String[] args) {

        displayValue(12);
        eligibleToVote(21,true);
        oddOrEven(200);


        System.out.println("-----------------------");
    }


    public static  void displayValue(int num){

        System.out.println("the value is: "+num);
    }

    public static void eligibleToVote(int age ,boolean isUSACitizen){
        if (age>=18 && isUSACitizen) {
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }

    }

    public static void oddOrEven(int number){

        if (number%2==0) {
            System.out.println("even  number");
        }else {
            System.out.println("odd number");
        }

    }
}
