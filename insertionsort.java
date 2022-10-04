import java.util.*;

public class insertionsort {
    public static void sortit(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // pusing elements to make space for current element to insert
            while (prev >= 0 && arr[prev] > curr) { //arr[prev]<curr for descending order

                arr[prev + 1] = arr[prev];
                prev--;

            }
            // prev+1 cause after the while loop the prev which contains the correct
            // position for insertion has shifted one more pos back from the actual position
            // of insertion.
            arr[prev + 1] = curr;

        }
        System.out.print("arrey after sorting is : \n");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

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
        System.out.print("arrey before sorting is : \n");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        sortit(arr);
        sc.close();
    }
}
