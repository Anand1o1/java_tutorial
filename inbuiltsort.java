import java.util.*; // this means we are importing all the inbuilt functions of java
import java.util.Arrays; // it is not needed as java.util.* is imported but to sort array it is to be imported in case java.util.* is not written.

public class inbuiltsort {
    public static void main(String[] args) {
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

        Arrays.sort(arr);
        // if you want to sort only a certain part of the index of the arrey then use Arrays.sort(arr,0,3);
        //Arrays.sort(arr,0,3);
        System.out.print("arrey after sorting is : \n");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        sc.close();
    }
}
