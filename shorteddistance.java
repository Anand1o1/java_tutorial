import java.util.*;

public class shorteddistance {
    public static float displacement(String str) {
        int y = 0;
        int x = 0;
        char l;
        for (int i = 0; i < str.length(); i++) {
            l = str.charAt(i);
            if (l == 'N') {
                y += 1;

            } else if (l == 'S') {
                y -= 1;

            } else if (l == 'W') {
                x -= 1;
            } else {
                x += 1;
            }

        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String args[]) {
        String rout="WNEENESENNN";
        System.out.print("the displacement of the pathe given is :\n");
        System.out.println(displacement(rout));

    }
}
