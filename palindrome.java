import java.util.*;

public class palindrome {
    public static boolean palindrome(int n) {
        int myNumber = n;
        int rev = 0;
        while (n > 0) { // n!=0
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        if (rev == myNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer value : ");
        int n = sc.nextInt();
        boolean palindrome = palindrome(n);
        if (palindrome) {
            System.out.println("This is palindrome number");
        } else {
            System.out.println("This is not palindrome number");
        }
    }
}
