import java.util.*;

public class selectionsort {
    public static void sortit(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// if length-1 cause no need to check the last interation every
                                                  // element will be sorted before than only and the largest element
                                                  // will be left at the last
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimum] > arr[j]) { // arr[minimum]<arr[j] for descending order
                    minimum = j;

                }
            }
            // swap now
            int temp;
            temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;

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

        sortit (arr);
        sc.close();

    }
}
