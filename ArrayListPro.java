package CH_objects;

import java.util.ArrayList;

public class ArrayListPro
{
    public static void main(String[] args){

        String[] fruits = new String[3];
        fruits [0] = "Mango";
        fruits [1] = "Apple";
        fruits [2] = "Strawberry";
        System.out.println(fruits[1]);

        ArrayList fruitlist = new ArrayList();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");
        fruitlist.add ("Watermelon");
        fruitlist.remove("Mango");

        System.out.println(fruitlist.contains("Rasberry"));
        System.out.println(fruitlist);
}
}