package Apna_Code.start;

import java.util.*;
public class Fever {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp > 100){
            System.out.println("You have Fever:");
        }
        else{
            System.out.println("You do not have Fever:");
        }
    }
}
