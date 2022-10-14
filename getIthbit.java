import java.util.*;

public class getIthbit {
    public static int ithbit(int n, int index) {
        int bitmask = 1 << index;
        if ((bitmask & n) == 0) {
            return 0;
        }

        return 1;

    }

    public static void main(String args[]) {
        System.out.println(ithbit(10, 2));
    }

}
