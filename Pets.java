package com.perscholas.java_basics;
// The Collections framework is defined in the java.util package

import java.util.ArrayList;

    public class Pets
{
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
// Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Horse");

        System.out.println("ArrayList:" + animals);
    }
}
