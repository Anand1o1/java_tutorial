import java.util.*;
public class squarearea {
    public static void main(String arg[])
    {
        System.out.print("enter the side of square: ");
        Scanner sc= new Scanner(System.in);
        float side=sc.nextFloat();
        System.out.print("the are of the square is : ");
        System.out.print(side*side);
        sc.close();


    }
    
}
