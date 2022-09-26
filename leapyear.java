import java.util.*;

public class leapyear {
    public static void main(String arg[]) {
        System.out.print("input a year in yyyy format : ");
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
                System.out.print("the year is a leap year ");

            }
        else {
            System.out.print("the year is not a leap year");
        }
        sc.close();
    }

}
