import java.util.*;

public class all_bits_manp {
    public static int ithbitclear(int num, int index) {
        int bitmask = ~(1 << index);
        return num & bitmask;

    }

    public static int updateithbit(int n, int i, int newbit) {
        n = ithbitclear(n, i);
        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static int clearbits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearbitsinrange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = (a | b);
        return n & bitmask;

    }

    public static boolean ispowerof2(int n) {
        // n=9 //n=16
        return (n & (n - 1)) == 0; // 8 and 9 //15 and 16
                                   // 1000 and //01111
                                   // 1001 and //10000
                                   // not 0 0
    }

    public static int countsetbits(int n) { // counting number of 1s in the binary digits of a number
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static int fastexpo(int num, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {// check LSB
                ans = ans * num;

            }
            num = num * num;

            pow = pow >> 1;

        }
        return ans;
    }

    public static long fastexpomod(long num, long pow, long mod) {
        long ans = 1;        // we are using this property  (a+b)%5=(a%5 +b%5)%5
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = (ans * (num % mod)) % mod; //https://www.youtube.com/watch?v=CnPreli2F-E

            }
            num = ((num % mod) * (num % mod)) % mod;
            pow = pow >> 1;
        }
        return ans;

    }
    //complement of a number in descimal

    //bits manupulation 1's complement and what is that number in descimal 
    //for example 5=101 we can also write it as 5= 0000101
    //so                                        5'=1111010 so now it became a negative number as its most significant bit(MSB) is 1
    //so to find 5' complement is descimal-->   
    //take it 1's complement                       0000101
    //now add binary one to it                          +1
    //                                             0000110=6 but as 5' was a negative number so it will be -6 so 5's complement is -6 in descimal     

    public static void main(String args[]) {
        System.out.println(fastexpomod(3978432, 5, 1000000007));
    }
}
