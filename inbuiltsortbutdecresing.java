import java.util.*;
import java.util.Collections;//if you want to prInteger in decresing order you have to import this


public class inbuiltsortbutdecresing {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        System.out.print("arrey after sorting is : \n");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }
}  
