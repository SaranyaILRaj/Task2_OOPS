package Task2;
//1.1) create a class person with properties (name and age) with following features.
//        a) Default age should be 18
//b) A person object can be initialized with name and age
//c) method to display name and age of person

//person class
public class Person {

    private String name;
    //Setting defalut age as 18
   final private int age=18;

    //constructor to initialize the object with parameters
    public Person(String name,int age)
    {
        this.name=name;
    }
    //Method to display person name and age
    public void displayPersonInfo()
    {
        System.out.println("Person name is:"+name+"\n"+"Person age is:"+age);
    }

    //Main method to access person class method to display person details
    public static void main(String[] args)
    {
        Person person=new Person("vicky",20);
        person.displayPersonInfo();

    }
}
