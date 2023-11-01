package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();

        //add example
        letters.add("A");
        letters.add("B");
        letters.add("C");

        //add more items to list
        letters.add("K");
        letters.add("A");
        letters.add("L");
        letters.add("I");
        letters.add("B");
        letters.add("A");
        letters.add("M");
        letters.add("A");

        //Remove Items
        letters.remove("A");
        letters.remove("B");
        letters.remove("C");

        //convert list to Array
        String[] strArray = new String[letters.size()];
        strArray = letters.toArray(strArray);
        System.out.println(Arrays.toString(strArray)); // will print "A,B,C"
     }
}
