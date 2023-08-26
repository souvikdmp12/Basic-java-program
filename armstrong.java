import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int rem = 0, sum = 0, digits = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        while (temp > 0) {
            rem = temp % 10;
            sum += (Math.pow(rem, digits));
            temp = temp / 10;
        }
        if (num == sum)
            System.out.println(num + " is armstrong");
        else
            System.out.println(num + " not armstrong number");
    }

}
