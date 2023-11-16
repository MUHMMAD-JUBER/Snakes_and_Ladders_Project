package Apna_Code.Loop;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 10899;
         while(n>0){
            int lastdigit = n%10;
             System.out.println(lastdigit + " ");
             n = n/10;
         }
        System.out.println(n);
    }
}
