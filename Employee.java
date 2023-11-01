package CH_objects;

public class Employee
{
String name;
int age;
String designation;
double salary;
    private double raise;

    // This is the constructor of the class Employee
    public Employee(String name){

        this.name = name;
    }

    // Assign the age of the Employee to the variable age.
    public void empAge(int empAge){
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }
        /* Print the Employee details */

    public void empSalary(int i) {
        this.salary = i;
    }

    public void salaryRaise()
    {

        this.raise = (salary * 0.1) * salary;
        System.out.println("the raise is;+ raise");
    }
    /* Print the Employee details */
    public void printEmployee()
    {
        String name = new String();
        System.out.println("Name:" + name);
        String age = null;
        System.out.println("Age:" + age);
        String designation = null;
        String Designation = null;
        System.out.println("Designation:" + Designation);
        System.out.println("Salary:" + salary);

        //print the employee details

        System.out.println("name:" + name);
        System.out.println("Age" + age);
        System.out.println("Designation:" + Designation);
        System.out.println("Salary" + salary);
    }
}

