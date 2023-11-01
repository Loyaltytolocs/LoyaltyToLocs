package MyArrayofObjects;

import java.util.ArrayList;

public class PersonImpl
{
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList();
// a person object can be created first
    Person Ranae = new Person ("Ranae");

// and then added to the list
    persons.add(Ranae);

// person objects can also be created "in the same sentence" that they are added to the list
    persons.add(new Person("Robyn"));
    persons.add(new Person("Bobby"));

    for (Person person: persons){
        System.out.println(person);
    }
    }



}
