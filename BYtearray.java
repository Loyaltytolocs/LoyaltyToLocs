package com.perscholas.java_basics;
import java.io.ByteArrayInputStream;

public class BYtearray {
    public static void main(String[] args) {
        // Creates an array of byte
    byte[] array = {1, 2, 3, 4,};

try {
    ByteArrayInputStream input = new ByteArrayInputStream(array);
    System.out.println("The bytes read from the input strean:");
        for (int i= 0; i < array.length; i++) {

            // reads the bytes
            int data = input.read();
            System.out.print(data + ", ");
        }
        input.close();
        }
catch(Exception e){
    e.getStackTrace();

        }
    }
}
