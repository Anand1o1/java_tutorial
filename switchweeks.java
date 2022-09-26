import java.util.*;

public class switchweeks {
    public static void main(String arg[]) {
        int day;
        System.out.print("enter a day from 1-7 : ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.print("today is Monday");

                break;
            case 2:
                System.out.print("today is Tuesday");
                break;
            case 3:
                System.out.print("today is Wednesday");
                break;
            case 4:
                System.out.print("today is Thursday");
                break;
            case 5:
                System.out.print("today is Friday");
                break;
            case 6:
                System.out.print("today is Saturday");
                break;
            case 7:
                System.out.print("today is Sunday");
                break;
            default:
                System.out.print("wrong input!! plese input the value again");

                break;
        }

        sc.close();
    }

}
