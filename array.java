import java.util.*;

public class array {
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
        // update
        marks[2] = 100;
        marks[1] = marks[1] + 1;
        // updated output
        System.out.println("math: " + marks[2]);
        System.out.println("chem: " + marks[1]);
    }
}
