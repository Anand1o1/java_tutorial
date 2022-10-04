import java.util.*;

public class bubblesort {
    public static void sortit(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {// for number of turns which is n-1....it will iterate one less then
                                                  // number of elements
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {// this will run till n-1-turns times for excahnging the
                                                          // values ...n-1-turns cause we don't want to touch the
                                                          // already swapped and sorted elements

                if (arr[j] > arr[j + 1]) { // arr[j]<arr[j+1] for descending order
                    swap++;
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            System.out.println(swap);
            if (swap == 0) {
                break;

            }

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
