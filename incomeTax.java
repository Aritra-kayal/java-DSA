import java.util.*;

public class incomeTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary per year: ");
        float income = sc.nextFloat();
        if (income < 500000) {
            System.out.println("Your salary after giving tax : " + income);
            System.out.println("Your tax is : 0");
        } else if (income >= 500000 && income <= 1000000) {
            float tax = income * 0.20f;
            float afterTax = income - tax;
            System.out.println("Your salary after giving tax : " + afterTax);
            System.out.println("Your tax is : " + tax);
        } else if (income > 1000000) {
            float tax = income * 0.30f;
            float afterTax = income - tax;
            System.out.println("Your salary after giving tax : " + afterTax);
            System.out.println("Your tax is : " + tax);
        } else {
            System.out.println("Invalid salary");
        }
    }
}
