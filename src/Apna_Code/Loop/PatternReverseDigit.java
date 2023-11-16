package Apna_Code.Loop;
import java.util.*;
public interface PatternReverseDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the digit number You want !");
       int n = sc.nextInt();

//        for Outer loop
        for(int line = n; line>=1; line-- ){
            for(int num =1; num<=line; num++){
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}

