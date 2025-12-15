public class typeCasting {
    public static void main(String args[]) {
        byte b = 10;
        b = (byte) (b * 2);
        System.out.println(b);
        char ch = 'a';
        char ch2 = 'b';
        System.out.println((int) ch);
        System.out.println((int) ch2);
        System.out.println(ch2 - ch);
    }
}
