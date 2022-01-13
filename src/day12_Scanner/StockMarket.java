package day12_Scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many shares do you have?");
        int shares = scan.nextInt();
        String result = "invalid number of shares";

        if (shares > 0) {
            System.out.println("How much your total value in the stock market ?");
            double totalValue = scan.nextDouble();

            scan.nextLine(); //  before we use the next nextLine() method we need to capture the "Enter" that's left by the nextDouble

            System.out.println("enter the name of the company you have the most shares in");

            System.out.println("");
            String companyName = scan.nextLine();
            result = "Your total stock market holding is $"+ totalValue + "which is made up of"+ shares+".\n"+ companyName+"is your company holdings.";

            System.out.println(result);
             scan.close();
        }
    }}

