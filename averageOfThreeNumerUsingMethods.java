import java.util.*;

public class averageOfThreeNumerUsingMethods {
    public static float average(float a, float b, float c) {
        float average = (a + b + c) / 3;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextFloat();
        System.out.print("Enter 3rd number: ");
        float c = sc.nextFloat();
        float average = average(a, b, c);
        System.out.println("Average of three numbers : " + average);
    }
}
