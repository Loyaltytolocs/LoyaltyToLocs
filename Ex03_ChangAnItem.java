package MyArrayList;

import java.util.ArrayList;

public class Ex03_ChangAnItem {
    public static void main(String[] args) {
        ArrayList<String>  ShoppingCart = new ArrayList<String>();
        ShoppingCart.add("Rice");
        ShoppingCart.add("Spinach");
        ShoppingCart.add("Salmon");
        ShoppingCart.add(0,"Peach Juice");
        ShoppingCart.remove("rice");
        ShoppingCart.remove(0);
        ShoppingCart.add("Ice Cream");

            System.out.println(ShoppingCart);

    }

}
