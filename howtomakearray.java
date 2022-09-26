import java.util.*;

public class howtomakearray {
    public static void main(String[] args) {
        int arr[]= new int[100];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        Scanner sc= new Scanner(System.in);
        arr[3]=sc.nextInt();
        System.out.println(arr[3]);
        sc.close();
        System.out.println(arr.length);

    }
}
