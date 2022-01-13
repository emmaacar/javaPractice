package day28_ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list =new ArrayList<>();

      list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));  // soru : 5 ten kucukleri sil

    //  for (int i = 0; i < list.size(); i++) {
    //     if (list.get(i) < 5){
    //         list.remove(i);
        list.removeIf(each ->each< 5);
        System.out.println(list);

        System.out.println("===================================");

    ArrayList<String> names = new ArrayList<>();  // soru : j ile baslayan isimleri sil

        names.addAll(Arrays.asList("java","java","phyton","c#","ruby","c++"));

        names.removeIf(p ->p.startsWith("j"));
        System.out.println(names);

}
}