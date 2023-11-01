package MyArrayofObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonTwoUserImpl
{
        public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);
            ArrayList<Person> persons = new ArrayList<>();

// Read the names of persons from the user
            while (true) {
                System.out.print("Enter a name, empty will stop: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }


                // Add to the list a new person
                // whose name is the previous user input
                persons.add(new Person(name));
            }

// Print the number of the entered persons, and their individual information
            System.out.println();
            System.out.println("Persons in total: " + persons.size());
            System.out.println("Persons: ");

            for (Person person: persons) {
                System.out.println(person);
            }





        }
    }



