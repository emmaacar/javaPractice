package day33_Static;

import java.util.concurrent.Callable;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("emel",42,89,45,9,'F','A');
        System.out.println( student1);
        student1.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.programmingLanguage();



            }
    }

