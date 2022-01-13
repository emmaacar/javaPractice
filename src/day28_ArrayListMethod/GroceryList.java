package day28_ArrayListMethod;

import java.util.ArrayList;

public class GroceryList {



    public static void main(String[] args) {

        ArrayList<String>groceryList =new ArrayList<>();

        // add (element): adds the element into the arraylist,size size will be increased by 1

        groceryList.add("banana");
        groceryList.add("apple");
        groceryList.add("cheese");
        groceryList.add("soy souce");
        groceryList.add("salt");
        groceryList.add("sugar");

        System.out.println(groceryList);
        System.out.println("--------------------");

        // size  method kactane element oldugunu gosteriyor.lenght metotla ayni sayilir
        int a =groceryList.size();

        System.out.println(a);
        System.out.println("-----------------");

        // get (index) apple cagiracaksan indek numarasini  yazip apple cagiracaksin

        System.out.println(groceryList.get(1));
        System.out.println("----------------------");




        // set(index, newElement)method  replace the element of the arrayList at given index to the new element

        // remove (int index): remove the element at the given index from the arrayList

        groceryList.remove(3);
        System.out.println(groceryList);

        System.out.println("-------------------");

        // remove(object): remove the given object from the ArrayList(first matching), and return boolean

        groceryList.remove("apple");
        System.out.println(groceryList);





    }
}
