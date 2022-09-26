public class prifixmaxsubarray {

    public static void subprint(int array[]) {
        int max = Integer.MIN_VALUE;
        int prifix[]=new int[array.length];
        int currsum = 0;
        prifix[0]=array[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i]=array[i]+prifix[i-1];
            
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                
                currsum =i==0?array[i]:prifix[j]-prifix[i-1];
                System.out.print(currsum+ ", ");
                if (max < currsum) {
                    max = currsum;
                }
                

            }
            System.out.println();
            
        }
        System.out.print("the maximum sum of the subarray is : " + max);
    }

    public static void main(String[] args) {
        int array[] = new int[] { 1, -2, 6, -1, 3 };
        // int hello[]={1,2,3,4,5,6};
        subprint(array);

    }

}
