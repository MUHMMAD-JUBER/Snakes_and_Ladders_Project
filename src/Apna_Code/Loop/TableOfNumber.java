package Apna_Code.Loop;

import java.util.*;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, table;
        System.out.println("Enter the number: ");
//        to hold the number
        num = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            table = num * i;

            System.out.println(num + "*" + i + " = " + table);
        }
    }

}

