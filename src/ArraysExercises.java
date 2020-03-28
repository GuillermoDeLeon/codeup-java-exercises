import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //this prints out the location/address of the memory where array is stored.
        System.out.println(Arrays.toString(numbers)); //this prints out the actual contents of arrays.

        // creating class named Person.  Person is type of class
//        class Person {
//            public String name;
//        }

        Person[] people = new Person[3]; //this class was already created in the Person.java class.
        people[0] = new Person("Rudolph");
        people[1] = new Person("Santa");
        people[2] = new Person("Snowman");


//        System.out.println(people[0]); //this does not print out name stored in element, prints out location of where element 0 is stored.

        for(Person p : people) {
            System.out.print(p + "  -->"); //this prints out memory location of each element
            System.out.println(p.getName()); // this is what prints out actual name stored in element. Have to use the getName() from the Person.java class
        }

        // this calls the addPerson method and adds new peron of Chad to print out.
        Person[] newGroup = addPerson(people, new Person("Chad"));
        for(Person p : newGroup) {
            System.out.println(p.getName());
        }
    }

    // the static method named addPerson, last step in exercise 1
    public static Person[] addPerson(Person[] group, Person newPerson) {
        Person[] newGroup = Arrays.copyOf(group, group.length+1);
        newGroup[newGroup.length-1] = newPerson;
        return newGroup;
    }
}