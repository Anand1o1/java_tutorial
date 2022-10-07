import java.util.*;

public class transposematrixq3 {
    public static void transpose(int arr[][]) {

    }

    public static void main(String args[]) {
        System.out.println("enter the size of row and column of the matrix : ");
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        int matrix[][] = new int[col][row];
        System.out.print("input elements in the array : \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=arr[j][i];
                
            }
        }
        System.out.print("the transpose of the input matrix is : \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" , ");

            }
            System.out.print("\n");

        }
        sc.close();

    }
}
