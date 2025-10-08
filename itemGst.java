import java.util.*;

public class itemGst {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pencil price : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter pen price : ");
        float pen = sc.nextFloat();
        System.out.print("Enter eraser price : ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        // add on - with 18% tax or gst
        float newTotal = (total + ((total * 18) / 100));
        System.out.println("After gst total price : " + newTotal);
        float onlyGst = newTotal - total;
        System.out.println("Only 18% gst price : " + onlyGst);
    }
}
