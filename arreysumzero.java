import java.util.*;

public class arreysumzero {
    public static void triplet(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if (arr[i] != arr[j] && arr[j] != arr[j2] && arr[j2] !=arr[i]) {
                        if (arr[i] + arr[j] + arr[j2] == 0) {
                            System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[j2] + "]");
                            System.out.print(",");

                        }
                    }

                }
            }
        }
        System.out.print("]");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrey\n");
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("input elements in the arrey \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        triplet(arr);

        sc.close();
    }
}
