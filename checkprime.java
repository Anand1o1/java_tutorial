import java.util.*;

public class checkprime {
    public static void main(String arg[]) {
        int n;
        System.out.print("input a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean isprime = true;
        if (n == 2) {
            System.out.print(n + " is a prime number");

        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }

            }
            if (isprime == true) {
                System.out.print(n + " is a prime");
            } else {
                System.out.print(n + " is not prime");
            }

        }
        sc.close();
    }
    

}
