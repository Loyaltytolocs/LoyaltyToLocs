package com.perscholas.java_basics;

public interface Movable <T>
{
    // abstract method one
        void move(T t, String locationCode);
    // abstract method two
        T getItemBeingMoved();
    // abstract method three
        String getLocationBeingMovedTo();
}
