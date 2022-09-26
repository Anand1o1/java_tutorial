
import java.lang.Math;

public class binarytodecimal {
    public static int bintodec(int bin) {
        int dec = 0;
        int num;
        int i=0;
        while(bin>0) {
            num = bin % 10;
            dec = dec + (num * (int) Math.pow(2, i));
            bin=bin/10;
            i++;

        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.print(bintodec(101));

    }
}
