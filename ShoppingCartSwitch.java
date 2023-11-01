package MyArrayList;

import java.util.ArrayList;

public class ShoppingCartSwitch
{

    public static void main(String[] args) {
        ArrayList<String> ShoppingCart = new ArrayList<String>();
        ShoppingCart.add(0, "Rice");
        ShoppingCart.add(1, "Spinach");
        ShoppingCart.add(2, "Salmon");
        ShoppingCart.add(3, "Peach Juice");
        ShoppingCart.add(4, "Ice Cream");

    //System.out.println("This is my Shopping Cart List:\n" +ShoppingCart);
      System.out.println("Choose the action you'd like to perform:");
      System.out.print(
              "1. Add Item\n"+
              "2. Access an Item\n"+
              "3. Change an Item\n"+
              "4. Remove an Iten\n"+
              "5. Array List Size\n\n"
      );

      switch (2){

          case 1:
                 //1. Add Item
            ShoppingCart.add("Rice");
            System.out.println(ShoppingCart);
            break;
          case 2:
               //2. Access an Item
            System.out.println(ShoppingCart.get(3));
            break;
          case 3:
              //3. Change an Item
              ShoppingCart.set(2, "Spinach");
              System.out.println(ShoppingCart);
              break;
          case 4:
              //4. Remove an Item
              ShoppingCart.remove(3);
              System.out.println(ShoppingCart);
              break;
          case 5:
              //5. Array List Size
              System.out.println(ShoppingCart.size());
              break;
          default:
              // default statement
              System.out.println("This is default option");
              break;




      }



      }


}
