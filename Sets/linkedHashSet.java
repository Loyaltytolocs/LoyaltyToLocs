package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet
{
    public static void main(String[] args) {
        //LinkedHashSet with 10 capacity and .50 load factor

            LinkedHashSet<Integer> numbers = new LinkedHashSet<>(10, 0.50F);

            // Creating an arrayList of even numbers

            ArrayList<Integer> evenNumbers = new ArrayList<>();
                evenNumbers.add(2);
                evenNumbers.add(4);
            System.out.println("ArrayList:" + evenNumbers);

            // Creating a LinkedHasSet from an ArrayList

            LinkedHashSet<Integer> Numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet:" + Numbers);

            // Using addAll() method
        Numbers.addAll(evenNumbers);
        Numbers.add(8);
        System.out.println("New LinkedHashSet:" + Numbers);
    }
}
