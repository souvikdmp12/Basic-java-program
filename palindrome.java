public class palindrome {
    public static void main(String[] args) {
        int num = 454;
        int temp, rem, sum = 0;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a palindrome number");
        } else
            System.out.println(temp + " is not a palindrome number");
    }
}
