import java.util.*;

public class two_darraycreation {
    public static boolean search(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length; j++){
                if(arr[i][j]==key){
                    System.out.println("the key is found at index :"+i+","+j);
                    return true;
                }
            }
        }
        System.out.println("the key is not found ");
        return false;
    
    }
    public static void minmax(int arr[][]){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>largest) {
                    largest=arr[i][j];
                    
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("the smallest number in the 2d array is : "+smallest);
        System.out.println("the largest number in the 2d array is : "+largest);

    
    }

    public static void main(String args[]) {
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        // int n=3,m=4;
        // or u can do this
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        //System.out.println(search(arr, 5));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }
        minmax(arr);
        sc.close();
    }
}
