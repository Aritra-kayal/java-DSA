public class numberPyramid2 {
    public static void pattern(int n) {
        // outer loop
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern(4);
    }
}
