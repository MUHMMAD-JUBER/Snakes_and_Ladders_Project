package Apna_Code.start;

import java.util.*;

public class Largestamng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " a is the Largset number");

        }
        else if (b>=c) {
               System.out.println(b + " b is the Largest number");
        }
        else{
                System.out.println(c +" c is the Largest number");
            }

    }
}





