import java.util.*;

public class factorial {
    public static void main(String arg[]) {
        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("the factorial of the number is : " + 1);

        } else {
            for (int i = n - 1; i > 0; i--) {
                n = n * i;

            }
            System.out.println("the factorial of the number is : " + n);
        }
       
        sc.close();

    }
}
