import java.util.*;

public class areaOfACircle2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the value of radius: ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println("Area of a circle is: " + area);
    }
}
