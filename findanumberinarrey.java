import java.lang.annotation.Target;
import java.util.*;

public class findanumberinarrey {
    public static int find(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

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
        int target;
        System.out.print("input the target\n");
        target = sc.nextInt();
        System.out.print("the output is : "+find(arr, target));
        


        sc.close();
    }
}
