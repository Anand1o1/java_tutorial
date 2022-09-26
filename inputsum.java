import java.util.*;
public class inputsum{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("input two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("the sum is:");
        System.out.print(sum);
        

        sc.close();
    }
}