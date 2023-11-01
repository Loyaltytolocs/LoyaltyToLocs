package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.List;

import java.util.Vector;

public class vectorlist
{
    // created a main method
     public static void main(String[] args)
        {
    // created vector String list
        Vector<String> Family = new Vector<>();
        Family.add(0,"Robyn");
        Family.add(1,"Robert");
        Family.add(2,"Ryan");
        Family.add(3,"Ranae");

    // create vector integer list
        Vector<Integer> Age = new Vector<>();
        Age.add(0,32);
        Age.add(1,40);
        Age.add(2,36);
        Age.add(3,30);

    //print name and age using
            System.out.println( "My Family's Names and Ages are" + Family + Age);
    }
}
