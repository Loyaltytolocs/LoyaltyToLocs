package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.Maps;

import java.util.TreeMap;
public class treeMap
{
    public static void main(String[] args){
        TreeMap<String, Integer> evenNumbers = new TreeMap();
        // using put method
            evenNumbers.put("Two",2);
            evenNumbers.put("Four",4);

        // using put if absent
        evenNumbers.putIfAbsent("Six",6);
        System.out.println("Tree Map of even numbers" + evenNumbers);


        // creating treemap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);

        // using put all
        numbers.putAll(evenNumbers);
        System.out.println("Tree Map of Numbers" + numbers);

    }
}
