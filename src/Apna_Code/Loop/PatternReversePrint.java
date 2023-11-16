package Apna_Code.Loop;

public class PatternReversePrint {
    public static void main(String[] args){
        int n  = 6;
//        Outer loop
        for(int line=0; line<n; line++){
//            Inner loop for space
            for(int star=2*(n-line); star>=0; star--){
                System.out.print(" ");
            }
            for(int star=0; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
