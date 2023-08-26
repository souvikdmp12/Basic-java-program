import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check");
        int num = sc.nextInt();
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else
            for (int i = 2; i <= num / 2; i++) {
                if (num % 2 == 0) {
                    flag = 1;
                    break;
                }
            }
        if (flag == 0) {
            System.out.println(num + " is a prime number");
        } else
            System.out.println(num + " is not prime number");

    }
}
