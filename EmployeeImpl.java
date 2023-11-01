
package CH_objects;

public class EmployeeImpl {
    private double raise;
    private double empsalary;

    public void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("Robyn Gaff");
        Employee empTwo = new Employee("Robert Gaff");
        Employee empThree = new Employee("Ryan Gaff");

        //Invoking methods for each object created
        empOne.empAge(32);
        empOne.empDesignation("Registered Nurse");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(40);
        empTwo.empDesignation("Marketing and Business");
        empTwo.empSalary(165000);
        empTwo.printEmployee();


        empThree.empAge(38);
        empThree.empDesignation("Project Manager");
        empThree.empSalary(120000);
        empThree.printEmployee();


        /*Assign the salary to the variable	salary.*/
        double empSalary = 0;
            double salary = empSalary;
            {
          this.empsalary = salary;
            }

            /* Print the Employee details */
            //public void {
            //  printEmployee;


            {
                String name = new String();
                System.out.println("Name:" + name);
                String age = null;
                System.out.println("Age:" + age);
                String designation = null;
                String Designation = null;
                System.out.println("Designation:" + Designation);
                System.out.println("Salary:" + salary);

                {

                    this.raise = (salary * 0.1) * salary;
                    System.out.println("the raise is;+ raise");
                    }
                //print the employee details

                System.out.println("name:" + name);
                System.out.println("Age" + age);
                System.out.println("Designation:" + Designation);
                System.out.println("Salary" + salary);
            }

        }


    }
