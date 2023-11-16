package Apna_Code.start;

import java.util.*;

public class ItemsBillcd {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float pen = scn.nextFloat();
        float pencil = scn.nextFloat();
        float eraser = scn.nextFloat();
        float total = pen+pencil+eraser;
        System.out.println("Total cost "+total);
        float GST = total*18/100;
        System.out.println("Gst "+GST);
        float TOTAL = GST+total;
        System.out.println("Total with gst = "+TOTAL);




    }

}
