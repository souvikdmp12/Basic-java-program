import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println("Specified year is leap year");
        } else
            System.out.println("Specified year is not leap year");

    }
}
