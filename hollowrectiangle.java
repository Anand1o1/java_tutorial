public class hollowrectiangle {
    public static void main(String arg[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 2 || i == 3) {
                    if (j == 2 || j == 3 || j == 4) {
                        System.out.print(" ");
                        continue;
                    }

                }

                System.out.print("*");
            }

            System.out.print("\n");

        }
    }
}
