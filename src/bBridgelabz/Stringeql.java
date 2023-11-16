package bBridgelabz;

public class Stringeql {
    public static void main(String args[]) {
        String s1 = "Zubair";
        String s2 = "Zubair";
        String s3 = new String("Zubair");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
