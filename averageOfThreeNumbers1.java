import java.util.*;

public class averageOfThreeNumbers1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float a = sc.nextFloat();
        System.out.print("\t");
        float b = sc.nextFloat();
        System.out.print("\t");
        float c = sc.nextFloat();
        System.out.print("\t");
        System.out.println();
        float avg = (a + b + c) / 3;
        System.out.println("Average of three numbers is : " + avg);
    }
}
