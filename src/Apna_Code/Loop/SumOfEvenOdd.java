package Apna_Code.Loop;

import java.util.*;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter the number :");
            num = sc.nextInt();
            if (num % 2 == 0){
                evenSum = evenSum+1;
            }
            else{
                oddSum = oddSum +1;
            }
            System.out.println("Do you want to continue? press 1 for Yes or press 0 for No");
            choice = sc.nextInt();

        } while (choice == 1);
            System.out.println(" Sum of Even numbers: " + evenSum);
            System.out.println( "Sum of Odd numbers: " + oddSum);

    }
}
