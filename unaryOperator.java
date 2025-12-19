import java.util.*;

public class unaryOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
    }
}
