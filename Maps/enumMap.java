package com.perscholas.java_basics.SetsMapsListRanaeUyaiJesus.Maps;
import java.util.EnumMap;


    public class enumMap
    {
        enum Size
        {
            SMALL,MEDIUM,LARGE,EXTRALARGE
        }

        public static void main(String[] args)
        {
            // creating an Enumap of the size enum
            EnumMap<Size,Integer> sizes1 = new EnumMap<>(Size.class);

            // using the put () Method
            sizes1.put(Size.SMALL,28);
            sizes1.put(Size.MEDIUM,32);
            System.out.println("EnumMap1:" + sizes1 );

            EnumMap<Size,Integer> sizes2 = new EnumMap<Size, Integer>(Size.class);

            // using the putall() method
            sizes2.putAll(sizes1);
            sizes2.put(Size.LARGE,36);
            System.out.println("EnumMap2:" + sizes2);

        }
    }