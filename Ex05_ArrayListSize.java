package MyArrayList;

import java.util.ArrayList;

public class Ex05_ArrayListSize {

    public static void main(String[] args) {
        ArrayList<String> ShoppingCart = new ArrayList<String>();
        ShoppingCart.add(0, "Rice");
        ShoppingCart.add(1, "Spinach");
        ShoppingCart.add(2, "Salmon");
        ShoppingCart.add(3, "Peach Juice");
        ShoppingCart.add(4, "Ice Cream");
        System.out.println(ShoppingCart.size());
        for (int i = 0; i < ShoppingCart.size(); i++) {
            System.out.println(ShoppingCart.get(i));
        }
    }
}