public class maxsubarray {

    public static void subprint(int array[]) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    currsum = currsum + array[j2];
                    System.out.print(currsum + ", ");
                    if (max < currsum) {
                        max = currsum;
                    }

                }
                currsum = 0;
                System.out.println();

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
