package Apna_Code.Loop;
import java.util.*;
public class PatternCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char ch = 'A';
//        outer loop
        for (int line= 1; line<=n; line++ ){
//            for character !
            for (int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
