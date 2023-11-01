package MyStrings.basics;
/*Using the equality operator (==) to compare strings is a very common mistake
that is made by programmers. Doing this will not result in a compilation error, but it
won’t give you the result you expect! The reason for this is that all you are doing is
finding out whether the objects occupy the same address space in memory—what
you actually want to be doing is comparing the actual value of the string attributes
of the objects.
Notice that an object of type String can also be used within a switch
statement to check to see if it is equal to one of several possible String values.
The simple StringCheckWithSwitch program below illustrates this by giving
a meaning for three symbols on a game controller for a particular game:*/

import java.util.Scanner;
public class St_02StringCheckWithSwitch
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String symbol;
// get symbol from user
        System.out.println("Enter the symbol(square/circle/triangle)");
        symbol = keyboard.next();
// use String object in switch
        switch(symbol)
        {
            case "square": System.out.println("ATTACK"); break;
            case "circle": System.out.println("BLOCK"); break;
            case "triangle": System.out.println("JUMP"); break;
            default: System.out.println("Invalid Choice");
        }
    }
}
