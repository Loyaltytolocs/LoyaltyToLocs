
package com.perscholas.java_basics;
import  java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {


    class Test {

        public static void main(String[] args) {
            // creating an Array List named colors
            List<String> colors = new LinkedList<>();

            // add elements in the Array List
            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");
            colors.add("Orange");

            // printing the ArrayList
            System.out.println(colors);
        }
    }
}
