import java.util.*;

public class function {
    public static void sum(int a,int b){
        int sum= a+b;
        System.out.print("sum is : "+ sum );

    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("input a and b\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        
        sc.close();
        
    }
}
