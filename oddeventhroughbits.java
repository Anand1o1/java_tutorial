public class oddeventhroughbits {
    public static void oddeven(int n){
        int bitmask=1;
        if ((n & bitmask)==0) {
            System.out.print("even number \n");
        }
        else
            System.out.print("odd number \n");
    }
    public static void main(String arg[])
    {
        oddeven(3);
        oddeven(2);
    }
}
