package Apna_Code.start;

import java.util.*;

public class IncomeTaxcod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax=0;
        if(income < 500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
            tax = (int) (income* 0.2);

        }
        else if(income>2000000){
            tax = (int) (income * 0.3);

        }
        System.out.println(tax + " here is your tax" );
    }
}
