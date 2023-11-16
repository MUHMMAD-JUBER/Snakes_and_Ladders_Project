package Apna_Code.Loop;

import java.util.*;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: " + a + " " + b);
    }
}

