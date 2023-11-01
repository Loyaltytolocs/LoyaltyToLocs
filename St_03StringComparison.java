package MyStrings.basics;

import java.util.Scanner;

/*The String class also has a very useful method called compareTo. As you
can see from Table 7.2 this method accepts a string (called myString for
example) and compares it to the string value of the object itself. It returns zero if the
strings are identical, a negative number if the original string comes before
myString in the alphabet, and a positive number if it comes later.
The program below provides an example of how the compareTo method is
used.
*/
public class St_03StringComparison
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String string1, string2;
        int comparison;
// get two strings from the user
        System.out.print("Enter a String: ");
        string1 = keyboard.next();
        System.out.print("Enter another String: ");
        string2 = keyboard.next();
// compare the strings
        comparison = string1.compareTo(string2);
        if(comparison < 0) // compareTo returned a negative number
        {
            System.out.println(string1 + " comes before " + string2 + " in the alphabet");
        }
        else if(comparison > 0) // compareTo returned a positive number
        {
            System.out.println(string2 + " comes before " + string1 + " in the alphabet");
        }
        else // compareTo returned zero
        {
            System.out.println("The strings are identical");
        }
    }
}
