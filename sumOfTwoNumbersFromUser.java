import java.util.*;

public class sumOfTwoNumbersFromUser {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number is: " + sum);
    }
}
