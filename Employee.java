package Task2A;
//1.4 Define a base class person with attributes name and age
//        create a subclass Employee that inherits from Person and adds attributes like empolyeeID and salary
//        Use the super keyword to initialize the person attributes in the Employee constructor

class Person {


    private String name;
    private int age;

    //Parameter constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter method to return person name
    public String getName() {
        return name;
    }
}

//employee class inherits person class
public class Employee extends Person
{
    private int employeeID;
    private double salary;

    //parameterized constructor with super keyword to call parent constructor
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    //Getter to return employee id
    public int getEmployeeID() {
        return employeeID;
    }

    //Main method to check the employee class inherits person class
    public static void main(String[] args)
    {
        Employee emp=new Employee("Vicky",20,988893,900700);
        System.out.println("Employee name is: "+emp.getName()+"\n"+"Employee ID is: "+emp.getEmployeeID());
    }
    }

