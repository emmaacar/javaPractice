package day08_IfStatement;

public class NameOfDay {

    public static void main(String[] args) {

        int no = 5;  // 1~7

        if (no == 1) {
            System.out.println("pazartesi");
        } else if (no == 2) {
            System.out.println("sali");
        } else if (no == 3) {
            System.out.println("carsamba");
        } else if (no == 4) {
            System.out.println("persembe");
        } else if (no == 5) {
            System.out.println("cuma");
        } else if (no == 6) {
            System.out.println("cumartesi");
        } else {
            System.out.println("pazar");

            System.out.println(" -----------------");

            String day;

            if(no == 1){
                day = "Monday";
            }else if(no == 2){
                day = "Tuesday";
            }else if(no== 3){
                day = "Wednesday";
            }else if( no == 4){
                day = "Thursday";
            }else if(no == 5){
                day = "Friday";
            }else if(no==6){
                day = "Saturday";
            }else{
                day = "Sunday";
            }

            System.out.println("day ="+day);

        }
            }

        }
