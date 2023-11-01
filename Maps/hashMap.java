package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.Maps;
import com.sun.jdi.Value;

import java.awt.print.Book;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        // Create a Hash Map
    HashMap<Integer, String> Books = new HashMap<>();
       // put method to add elements of Map
    Books.put(1, "Richest Man in Babylon");
    Books.put(2, "Think and Grow Rich");
    Books.put(3, "Game of LIfe");
    Books.put(4, "Secret");
    System.out.println("HashMap:" + Books);

        // Iterate through keys only
    System.out.print("Keys:");
    for (Integer key : Books.keySet()){
        System.out.print(key);
        System.out.print(" , ");
    }

        // Iterating HashMap through for loop
        for (Map.Entry<Integer, String> set :
                Books.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
        }
    }

