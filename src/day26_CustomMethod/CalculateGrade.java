package day26_CustomMethod;

public class CalculateGrade {



        public static void grade ( int score){
            String grade = "invalid";

            if (score >= 0 && score <= 100) ;
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "E";

        }


    }


//5. create a method that can calculate the grade of the student based on the score