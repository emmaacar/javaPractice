package practice12_22_2021;

public class WhileLoop {
    public static void main(String[] args) {

        int number=5;
        while (number<100){
            number+=number; // number =number+number; // number= 5+5=10 and 10+10=20  and 20+20=40... till 100
        }
        System.out.println(number);
    }
}
