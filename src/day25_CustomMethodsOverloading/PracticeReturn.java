package day25_CustomMethodsOverloading;

public class PracticeReturn {



    public static void main(String[] args) {

        int b =sum(4,5);
        System.out.println("b = " + b);

        double a = sum(1,2);
        System.out.println("a = " + a);
        
        int subtrac =subtrac(5,3);
        System.out.println("subtrac = " + subtrac);
        
        double num = (55-45);
        System.out.println("num = " + num);
        
        int nums =(5*5);
        System.out.println("nums = " + nums);
        }


      //Create a method that can return the sum of two integers.
    public static  int sum(int num1,int num2) {

        int result;
        result = num1 + num2;
        return result;
    }


        //  Create a method that can return the sum  of two decimal numbers
        public static double sum(double num1,double num2){

             double result;
             result =num1+num2;
             return result;
        }

         // Create a method that can return the subtraction of two integers
            public static int subtrac(int a,int b) {

                int result;
                result =a-b;
                return result;
            }
           // Create a method that can return the subtraction of two decimals
    
             public static double num(double num1,double num2){
        
             double num;
             num = num1-num2;
             return num;

             }
             // Creata a method that can return the multiplication of two integers
             public static int carp(int num1,int num2){
        
             int num;
             num = num1*num2;
             return num;
                     
             }
             

    
            
            }



    

