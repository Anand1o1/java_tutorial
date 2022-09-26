import java.util.*;
public class averageof3 {
    public static void main(String arg[])
    {
        System.out.println("input three numbers:");
        Scanner sc= new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int avg;
        avg=(x+y+z)/3;
        System.out.print("the average of three number is:");
        System.out.print(avg);


        sc.close();

    }
    
}
