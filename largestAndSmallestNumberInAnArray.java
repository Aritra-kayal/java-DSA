import java.util.*;

public class largestAndSmallestNumberInAnArray {
    public static int smallAndLarge(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            // for largest number in an array
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            // for smallest number in an array
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest number is: " + smallAndLarge(numbers));
    }
}
