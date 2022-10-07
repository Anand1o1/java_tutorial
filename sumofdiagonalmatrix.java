import java.util.*;

public class sumofdiagonalmatrix {
    public static void sumofdiagonal(int arr[][]) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // // primary diagonal
        // for (int j = 0; j < arr[0].length; j++) {
        // if (i == j) {
        // sum += arr[i][j];
        // }
        // // secondary diagonal
        // if (i + j == arr.length - 1) {
        // sum += arr[i][j];

        // }
        // }
        // } // this approch is not the most optimised approch as its time complexity is
        // O(n^2) so we can write a more optimised solution for this with a time
        // complexity of O(n).
        
        
        //O(n) time complexicity
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i]; // primary diagonal where i=j

            if (i != arr.length-i-1) {// we are writing the if condition to stop the additionn of overlaping element in the secondary diagonal
                
                
                sum+= arr[i][arr.length-i-1];//in secondary diagonal i+j=length.arr-1 so =>j=length.arr-i-1
            }
        }
        System.out.print("the sum of diagonal matrix is : " + sum);

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        sumofdiagonal(matrix);
    }
}
