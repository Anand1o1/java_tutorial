import java.util.*;

public class kadansalgoritmforboth {
    public static void kadans(int arr[]) {
        int currsum = arr[0], maxsum;
        maxsum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            if (maxsum < currsum) {
                maxsum = currsum;

            }
        }
        System.out.print("the maximum sum of the arrey is : " + maxsum);

    }

    public static void kadansforboth(int arr[]) {

        int k = 0;
        int currsum = arr[0];
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                k++;
            }
        }
        if (k == arr.length) {

            for (int j = 1; j < arr.length; j++) {
                if (currsum < arr[j]) {
                    currsum = arr[j];
                }
            }
            maxsum = currsum;
            
        } else {

            for (int i = 1; i < arr.length; i++) {
                currsum += arr[i];
                if (currsum < 0) {
                    currsum = 0;
                }
                if (maxsum < currsum) {
                    maxsum = currsum;

                }
            }

        }
        System.out.print("the maximum sum of the arrey is : " + maxsum);

    }

    public static void main(String arg[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        kadansforboth(arr);
        sc.close();
    }
}
