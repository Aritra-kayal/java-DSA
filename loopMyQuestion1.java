import java.util.*;

public class loopMyQuestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of even number is : " + evenSum);
        System.out.println("Sum of odd number is : " + oddSum);
    }
}
