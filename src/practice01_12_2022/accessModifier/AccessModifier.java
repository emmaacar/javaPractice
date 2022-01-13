package practice01_12_2022.accessModifier;

import day05_aritmaticOperators.day_4CustomMethod.WrapperClassIntro;

import java.sql.Wrapper;

public class AccessModifier {

    public static void main(String[] args) {

        Person person =new Person();
        person.ID =158;
        person.name ="Emel";
        person.lastName ="Sayinhan";
       // person.age = 42;

        WrapperClassIntro wp=new WrapperClassIntro();
        System.out.println("wp.str = " + wp.str);
    }
}
