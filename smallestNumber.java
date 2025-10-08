import java.util.*;

public class smallestNumber {
    public static int smallestNumber(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Smallest Value is: " + smallestNumber(numbers));
    }
}
