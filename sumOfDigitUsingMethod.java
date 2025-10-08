import java.util.*;

public class sumOfDigitUsingMethod {
    public static int sumOfDigit(int n) {
        int sumOfDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigit = sumOfDigit + lastDigit;
            n = n / 10;
        }
        return sumOfDigit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number : ");
        int n = sc.nextInt();
        int sum = sumOfDigit(n);
        System.out.println("Sum of digit : " + sum);
    }
}
