import java.util.*;
public class averageOfThreeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float Avg = (A+B+C)/3;
        System.out.print("Average of three number is : ");
        System.out.println(Avg);
    }
}
