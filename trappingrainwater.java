import java.util.*;
public class trappingrainwater{
    public static void trappedrain(int height[]){

        //calculate left max
        //calculate right max
        //calculate minimum of both
        //subtract it with the current height
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i =n-2 ; i>=0; i--) {
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int raintrapped=0;
        int rainlevel[]=new int[n];
        for (int i = 0; i < n; i++) {
            rainlevel[i]=Math.min(leftmax[i], rightmax[i]);
            raintrapped+=(rainlevel[i]-height[i]);
        }
        System.out.print("the trapped rainwater between all the buildings is : "+raintrapped);

    }


    public static void main(String arg[]){
        int height[]={4,2,0,6,3,2,5};
        trappedrain(height);
    }
}