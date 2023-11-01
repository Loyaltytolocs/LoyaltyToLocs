package MyStrings.basics;

import java.util.Scanner;

/*
As we mentioned above there is a problem with using the next method of
Scanner when we enter strings that contain spaces. If you try this you will see
that the resulting string stops at the first space, so if you enter the string “Hello
world” for example, the resulting string would actually be “Hello”.

To enter a string that contains spaces you need to use the method nextLine.
Unfortunately however there is also an issue with this. If the nextLine method is
used after a nextInt or nextDouble method, then it is necessary to create a
separate Scanner object (because using the same Scanner object will make
your program behave erratically).

So, if your intention is that the user should be
able to enter strings that contain spaces, the best thing to do is to declare a separate
Scanner object for string input. St_04_Strings_Containing_Spaces:

*/
public class St_04StringContainingSpaces
{
    public static void main(String[] args)
    {
        double d;
        int i;
        String s;
        Scanner keyboardString = new Scanner(System.in); // Scanner object for string input
        Scanner keyboard = new Scanner(System.in); // Scanner object for all other types of input
        System.out.print("Enter a double: ");
        d = keyboard.nextDouble();
        System.out.print("Enter an integer: ");
        i = keyboard.nextInt();
        System.out.print("Enter a string: ");
        s = keyboardString.nextLine(); // use the Scanner object reserved for string input
        System.out.println();
        System.out.println("You entered: ");
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
        System.out.println("String: " + s);
    }
}
