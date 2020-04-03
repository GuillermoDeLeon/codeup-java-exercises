package grades;


//Create a map for students and GitHub usernames
//
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//
//        Be creative! Make up GitHub usernames and grades for your student objects.

// example of hw to create a hash map
//HashMap<String, String> usernames = new HashMap<>();

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) throws Exception{
        HashMap<String, Student> students = new HashMap<>();

        //create 4 students and add grades for each
        students.put("batman", new Student("Bruce"));
        students.put("iron man", new Student("Robert"));
        students.put("starlord", new Student("Pratt"));
        students.put("wonder woman", new Student("Diana"));

        //add random grades
        Random random = new Random();
        for (int i=0; i < 4 ; i++) {
            students.get("batman").addGrade(random.nextInt(100));
            students.get("iron man").addGrade(random.nextInt(100));
            students.get("starlord").addGrade(random.nextInt(100));
            students.get("wonder woman").addGrade(random.nextInt(100));
        }

        System.out.println("\n\n\tWelcome!\n\n\tHere are the Github usernames of our students:\n");
        System.out.println("\t" + students.keySet());

        //create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        String ghUser;
        boolean confirmation = true;
        do {
            ghUser = Input.getString("\tWhich student stats would you like to view?: ");
            //check if typed user actually exists
            if(!students.containsKey(ghUser)) {
                System.out.println("\n\tNo student with that Github username was found :-(");
            } else {
                //they did type a matching gh username / key
                Student thisStudent = students.get(ghUser);
                System.out.println("\n\n\tName: " + thisStudent.getName() + " || GH uname: " + ghUser + " || Current grade average: " + thisStudent.getGradeAverage());
            }
            confirmation = Input.yesNo("\tWould you like to see another? [y/n]");
        } while(confirmation); //once user says they don't want to participate, EXIT
    }
}
