import java.lang.Math;
import java.util.Scanner;

public class palendrom {
    public static int reverse(int n) {
        int i = 0;
        int num=n;
        while (num>0) {
            num=num/10;
            i++;
        }
        int rev = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            rev = rev + lastdigit* (int) Math.pow(10, i-1);
            n = n / 10;
            i--;

        }
        return rev;
    }

    public static boolean ispalendrom(int n) {
        if (n == reverse(n)) {
            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("input a number to check for palendrom : ");
        num=sc.nextInt();
        System.out.println(reverse(num));
        if (ispalendrom(num)) {
            System.out.println(num+" is a palendrom");
        }
        else{
            System.out.println(num+" is not a palendrom");
        }

        sc.close();

    }
}
