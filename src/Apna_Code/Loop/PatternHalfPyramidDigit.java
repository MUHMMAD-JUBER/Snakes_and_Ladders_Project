package Apna_Code.Loop;
import java.util.*;
public class PatternHalfPyramidDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want :");
        int n= sc.nextInt();
//        for Outer loop !
        for (int line = 1; line<=n; line++){
//            for number
            for (int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
