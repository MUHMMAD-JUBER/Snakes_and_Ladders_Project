package Apna_Code.start;

import java.util.*;
public class Calculatorcod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        char operator =sc.next().charAt(0);
        System.out.println("Enter Operator :");
        switch(operator){
            case '+':
                System.out.println(a+b);
                    break;
            case '-':
                System.out.println(a-b);
                    break;
            case '*':
                System.out.println(a*b);
                    break;
            case '/':
                System.out.println(a/b);
                    break;
            case '%':
                System.out.println(a%b);
                    break;
            default :
                System.out.println("Wrong Operator");

        }
    }


}
