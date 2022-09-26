import java.lang.Math;

public class descimaltobinary {
    public static int dectobin(int n) {
        int dec = 0;
        int i = 0;
        while (n > 0) {
            int rem = n % 2;
            dec = dec + (rem * (int) Math.pow(10, i));
            i++;
            n = n / 2;

        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.print(dectobin(7));

    }
}
