
import java.util.*;

public class repeatednum {
    public static boolean function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;

                }
            }
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print(function(arr));
        
        sc.close();
    }
}
