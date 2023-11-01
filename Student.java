package MyArrayofObjects;

    // Creating a student class with
    // id and name as a attributes

class Student {
public int id;
public String name;

    // student class constructor
    Student(int id, String name)
    {

        this.id = id;
        this.name = name;
    }

    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("student id is:" + id +"" + "and Student name is:" + name);
        System.out.println();
    }

}
