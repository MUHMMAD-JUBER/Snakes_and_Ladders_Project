package Apna_Code.Loop;

import java.util.*;
public class Print_n_number {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        while(counter<=n){
            System.out.println(counter +" ");
            counter++;
        }
        System.out.println();

    }
}
