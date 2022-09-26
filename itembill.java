import java.util.*;

public class itembill {
    public static void main(String arg[]) {
        System.out.println("enter the price of items:");
        Scanner sc = new Scanner(System.in);
        System.out.print("pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("pen : ");
        float pen = sc.nextFloat();
        System.out.print("eraser : ");
        float eraser = sc.nextFloat();
        float sum = pencil + pen + eraser;
        float gst = 0.18f * sum;
        System.out.println("\n");
        System.out.print("pencil :");
        System.out.println(pencil);
        System.out.print("pen : ");
        System.out.println(pen);
        System.out.print("eraser : ");
        System.out.println(eraser);
        System.out.print("total price without gst :");
        System.out.println(sum);
        System.out.print("total price with gst : ");
        System.out.println(sum + gst);

        sc.close();

    }

}
