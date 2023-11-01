package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.List;
import java.util.LinkedList;


class linkedlist{
    public static void main(String[] args) {
    //create the linked list
        LinkedList<String> animals = new LinkedList<>();
    //add method
        animals.add("Dog");
        animals.add("Cat");
        animals.add("cow");
        System.out.println("LinkedList:" + animals);

     // add additional animals
     animals.add(1,"Horse");
        System.out.println("Updated LinkedList:" + animals);


     // Get the elements of updated linkedlist
    String str = animals.get(1);
        System.out.println("Element at index 1:" + str);
    }
}
