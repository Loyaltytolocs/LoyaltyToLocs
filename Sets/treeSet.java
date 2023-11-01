package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.Sets;

import java.util.TreeSet;
import java.util.Iterator;

    public class treeSet
    {
        public static void main(String[] args)
        {
            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(2);
            numbers.add(4);
            numbers.add(6);
            System.out.println("TreeSet: "+ numbers);

            // calling interator() method
            Iterator<Integer> iterate =  numbers.iterator();
            System.out.println("TreeSet using Iterator");

            //Accessomg elements
            while (iterate.hasNext())
            {
                System.out.println(iterate.next());
                System.out.println(" , ");
            }

        }

    }
