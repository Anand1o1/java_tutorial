import java.util.*;
public class multiplication {
    public static void main(String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number whose multiplication table you want to see: ");
        n=sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n*i);
            
        }
        sc.close();


    }
}
