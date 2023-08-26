import java.util.*;

class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you print fibbonaci series: ");
        int num = sc.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print(f1 + " " + f2);
        int sum;
        for (int i = 2; i < num; i++) {
            sum = f1 + f2;
            System.out.print(" " + sum);
            f1 = f2;
            f2 = sum;
        }

    }
}