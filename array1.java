import java.util.*;

public class array1 {
    public static void main(String args[]) {
        // creating an array
        int marks[] = new int[100];
        // input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();// phy
        marks[1] = sc.nextInt();// chem
        marks[2] = sc.nextInt();// math
        // output
        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);
        // percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + percentage + "%");
        // length of an array
        System.out.println("Length of an array = " + marks.length);
    }
}
