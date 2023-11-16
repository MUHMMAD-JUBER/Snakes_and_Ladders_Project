package Apna_Code.Loop;

import java.util.*;
public class PatterniInverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En4ter the number: ");
        int n = sc.nextInt();
        for (int line=1; line<=n; line++ ){
            for (int star =1;star<=n-line+1; star++ ){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
