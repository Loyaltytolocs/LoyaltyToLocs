package com.perscholas.java_basics;
interface Cat {

    default String says() {
        return "miaw";
    }
}

interface Lion {

    default String says() {
        return "ROAR!";
    }

}

class Tiger implements Cat, Lion {

}

public class Main {

    public static void main(String args[]) {
        System.out.println(new Tiger().says());
    }

}