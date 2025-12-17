import java.util.*;

public class dataTypePracticeQuestion3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the price of pencil: ");
        int pencil = sc.nextInt();
        System.out.print("Enter the price of pen: ");
        int pen = sc.nextInt();
        System.out.print("Eneter the price of eraser: ");
        int eraser = sc.nextInt();
        int total = pencil + pen + eraser;
        System.out.println("Total price: " + total);
        float gst = total * 0.18f;
        float finalTotal = total + gst;
        System.out.println("Final total after 185 gst: " + finalTotal);
    }
}
