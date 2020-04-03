package grades;

import java.util.ArrayList;

public class Student {  // *** student class ***
    private String name;  // *** private property for student name ***
//    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Integer> grades;  // *** private property that is an ArrayList of integers ***

// *** THREE methods below are from Codeup Curriculum exercise 1
    public String getName() {
        return this.name;
    }
    //***REVIEW how this works, is it adding an element or is it adding the actual grade???
    public void addGrade(int grade) {
        this.grades.add(grade); //*** .add method from COLLECTIONS lecture -- add element to collection at specified index
        //we can comment item below  later, example below used by Casey to check output, not sure why he didn't use this.name and this.grade.
//        System.out.println(name + " just scored a " + grade); //this prints out the grades
    };
    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : this.grades) {
            total = total + grade;
        }
        return total / this.grades.size(); //*** .size method from COLLECTIONS lecture --> returns the # of elements in the array
    };

//*** END of the three methods from exercise 1

    // ** constructor **
    public Student(String name) { // *** constructor of Student class
//        System.out.println("Student created from constructor ");
        this.name = name; // *** I think this is what "sets" the --name-- property, in other words, when argument is passed to parameter String name, then that argument is assigned to this.name - I think.
        this.grades = new ArrayList<>(); // *** I think this is what is "initializing" the --grades-- property as an empty ArrayList
    }

    // *** main method below was added per request at end of Exercise 1 to test the methods created in Exercise 1 -- this is only used for testing.  Will be commented out since the GradesApplication class will use the main method***
//    public static void main(String[] args) {
//        Student student1 = new Student("Guillermo"); //*** this creates new student object that passes the String argument of "Guillermo"***
//        System.out.println(student1.getName()); //*** this is my test to print out the result of what was passed to object --student1--***
//        student1.addGrade(88);  //*** these next 3 pass 3 grades to the ArrayList called grades***
//        student1.addGrade(87);
//        student1.addGrade(86);
//        System.out.println(student1.grades); //*** and this is my test to print out the array with contents in the grades ArrayList ***
//        System.out.println(student1.getGradeAverage());
//
//        Student student2 = new Student("Willie");
//        System.out.println(student2.getName());
//        student2.addGrade(88);
//        student2.addGrade(89);
//        student2.addGrade(90);
//        System.out.println(student2.grades);
//        System.out.println(student2.getGradeAverage());
//
//    }

}

