import java.util.*;

public class ispalendrom {
    public static boolean palendrom(String abcde) {
        for (int i = 0; i < abcde.length() / 2; i++) {
            int n = abcde.length();
            if (abcde.charAt(i) != abcde.charAt(n - i - 1)) {
                return false;
            }
 
        }
        return true;

    }

    public static void main(String args[]) {
        String a = "anand";
        System.out.println(palendrom(a));

    }
}
