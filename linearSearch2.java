//search the index of a menu
public class linearSearch2 {
    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = { "Dosa", "Chhole bhature", "Samose", "Sandwich", "Frooti", "Coke" };
        String key = "Samose";
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Menu is at index : " + index);
        }
    }
}
