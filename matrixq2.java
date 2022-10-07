import java.util.*;

public class matrixq2 {
    public static void sumofrow(int arr[][],int row){
        int sum=0;
        for (int j = 0; j < arr[0].length; j++) {
            sum+=arr[row-1][j];
        }
        System.out.println("the sum of the rows element is : "+sum);
    
    }
    public static void main(String args[]) {
        int arr[][] = { { 1, 4, 9 },
                        { 11,4, 3 }, 
                        { 2, 2, 3 } };
        sumofrow(arr, 2);
    }
}
