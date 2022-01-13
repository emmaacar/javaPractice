package day12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"aysegul", "timur", "alaksander", "lili"};

        String[] scrum2 = {"gul", "tarik"};

        String[] scrum3 = {"ayse", "tamer", "ali"};

        String[][] scrumteam = {{"aysegul", "timur", "alaksander", "lili",}, {"gul", "tarik"}, {"ayse", "tamer", "ali"}};
                             //  {scrum1,scrum2,scrum3}

        System.out.println(Arrays.deepToString(scrumteam));

       // System.out.println(Arrays.deepToString()scrumteam[1][1]);
        System.out.println(scrumteam[1][1]);

        System.out.println("-----------------------");

        for (String[]eachScrum : scrumteam){
            System.out.println(Arrays.toString(eachScrum));



            }

        }
    }
