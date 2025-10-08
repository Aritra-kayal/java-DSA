import java.util.*;

public class maxSubarraySum1BruteForce {
    public static void subarray(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                current_sum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    current_sum += numbers[k];
                }
                System.out.println(current_sum);
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Max subarray sum 1 : " + max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        subarray(numbers);
    }
}
