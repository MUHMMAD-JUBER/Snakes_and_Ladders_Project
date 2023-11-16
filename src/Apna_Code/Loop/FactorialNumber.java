package Apna_Code.Loop;

import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        to hold number
        int num;

//        to hold factorial num
        int fact = 1;

        System.out.println("Enter any positive integer number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial number: " + fact);
    }
}
