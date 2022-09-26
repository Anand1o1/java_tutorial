
import java.lang.Math;

public class kadansmaxsubarray {
    public static void kadans(int number[]) {
        int mn = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < number.length; i++) {
            currsum = currsum + number[i];
            if (currsum < 0) {
                currsum = 0;
            }
            mn = Math.max(currsum, mn);
        }
        System.out.print("the maximum sum of the array is : " + mn);

    }

    public static void main(String[] args) {
        int number[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };

        kadans(number);

    }

}
