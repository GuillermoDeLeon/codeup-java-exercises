import java.util.Scanner;

public class Person {
    private String name;

    //constructor that accepts String value
    public Person(String input) {
        System.out.println("A person is being created." );
        this.name = input;
    }

    // returns the person's name
    public String getName() {
        return this.name;
    };
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + this.name);
    };

    public static void main(String[] args) {
        //Exercise 1
//        Person p1 = new Person("Theon");
//        System.out.println("p1.getName() = " + p1.getName());
//        p1.sayHello();
//        p1.setName("Randy");
//        p1.sayHello();

        //Exercise 2

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  //outputs true
//        System.out.println(person1 == person2); //outputs false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //outputs true
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

//        Exercise 3

    }

}
