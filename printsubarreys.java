public class printsubarreys {
    public static void subprint(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(array[j2]);
                    
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5,6};
        //int hello[]={1,2,3,4,5,6};
        subprint(array);


        
    }
}
