import java.util.Scanner;

public class evenoddsum {
    public static void main(String arg[])
    {
        int n;
        int oddsum=0;
        int evensum=0;
        Scanner sc= new Scanner(System.in);
        int i;
        do {
            System.out.print("input a number: ");
            n=sc.nextInt();
            if (n%2==0) {
                evensum+=n;
                System.out.println("the evensum is :" + evensum);
                
            }
            else{
                oddsum+=n;
                System.out.println("the oddsum is :" + oddsum);
            }
            System.out.print("if you want to keep going press 1 else 0 :");
            i=sc.nextInt();
            
        } while (i==1);
        sc.close();
    }
}
