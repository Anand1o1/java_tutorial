import java.util.*;

import javax.management.relation.Role;

public class staircasesorting {
    public static boolean sortit(int arr[][], int key) {
        //upside corner sae karke sorting

        // int row = 0;
        // int col = arr[0].length - 1;
        // while (row < arr.length && col >= 0) {
        //     if (arr[row][col] == key) {
        //         System.out.println("the index of the key is : " + row + " , " + col);
        //         return true;
        //     } else if (key<arr[row][col]) {
        //         col--;
        //     } else {
        //         row++;

        //     }

        // }

        //downside starting sae karke sorting
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
            if (arr[row][col]==key) {
                System.out.println("the index of the key is : " + row + " , " + col);
                return true;
                
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }

    System.out.println("the key does not exist in the array....!!!..enter a valid key");
    return false;

    }

    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        sortit(arr, 33);

    }
}
