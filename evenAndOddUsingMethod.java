import java.util.*;

public class evenAndOddUsingMethod {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number : ");
        int n = sc.nextInt();
        boolean isEven = isEven(n);
        if (isEven) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
