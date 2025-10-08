public class arrayImportant {
    public static int update(int nonChangable) {
        nonChangable = 10;
        return (nonChangable);
    }

    public static void main(String args[]) {
        int nonChangable = 5;
        int a = update(nonChangable);
        System.out.println(a);
    }
}
