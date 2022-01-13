package day28_ArrayListMethod;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String>groceryList= new ArrayList<String>();

       // add method
        groceryList.add("banana");
        groceryList.add("apple");
        groceryList.add("cheese");
        groceryList.add("soy sauce");
        groceryList.add("salt");
        groceryList.add("sugar");

        System.out.println(groceryList);
        System.out.println("=====================");

        // size()
        int a = groceryList.size();
        System.out.println(a);

        // get(index)
        System.out.println(groceryList.get(1));

        System.out.println("==================");

        // set(index newElement)
        groceryList.set(2,"elma");
        System.out.println(groceryList);

        System.out.println("=======================");

        // remove(int index)
        groceryList.remove(4);
        System.out.println(groceryList);

        System.out.println("============================");

        //remove (object)

        boolean r1 = groceryList.remove("java");
        System.out.println(r1);

        System.out.println("==============================");

        // clear

        groceryList.clear();
        System.out.println(groceryList);

        System.out.println("==================================");



        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

         // index of element

        int b =numbers.indexOf(40);
        System.out.println(b);







    }
}
