package day23_CostomMethod_Void;

public class BuyAlcohol {
    public static void main(String[] args) {
        eligible(35);

    }

    public static void eligible(int age) {


        if (age >= 21) {
        System.out.println("eligible to buy alcohol");
    }else {
            System.out.println("Not eligible to buy alcohol ");

        }
        }

    }


/*
3. create a method that can check if a person is eligible to buy alcohol
 */