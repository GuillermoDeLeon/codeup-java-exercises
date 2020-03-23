import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int x = 0;
//
//        do {
//            System.out.print(x + " ");
//            x+= 2;
//        } while (x <= 100);

//        int y = 100;
//        do {
//            System.out.print(y + " ");
//            y -= 5;
//        } while (y >= -10);

//        long z = 2;
//        do {
//            System.out.println(z + " ");
//            z *= z;
//        }while (z < 100000);

//        FizzBuzz problem 2
//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz ");
//                continue;
//            }
//            if(i % 3 == 0) {
//                System.out.println("Fizz ");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz ");
//                continue;
//            }
//            System.out.println(i);
//        }
//        FizzBuzz problem 3

        boolean userContinue = true;

        do {
            System.out.print("What number would you like to go up to?  ");

            long userInput = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (var i = 1; i <= userInput; i++) {
                System.out.printf("%-6d |", i);
                var squared = i * i;
                var cubed = i * i * i;
                System.out.printf("%-8d |", squared);
                System.out.println(cubed);
            }
            System.out.println("Would you like to try another number? y = yes, n = no ");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinue = false;
            };
        }while(userContinue );

//        boolean userContinue = true;
//
//        do {
//            System.out.println("Enter a grade from 0 - 100:");
//            int grade = scanner.nextInt();
//
//            if (grade >= 88) {
//                System.out.println("Your grade is an A");
//
//            } else if (grade >= 80 && grade < 88) {
//                System.out.println("Your grade is a B");
//
//            } else if (grade >= 67 && grade < 80) {
//                System.out.println("Your grade is a C");
//            } else if (grade >= 60 && grade < 67) {
//                System.out.println("Your grade is a D");
//            } else {
//                System.out.println("You have an F!");
//            }
//            System.out.println("Would you like to enter another grade? y = yes, n = no");
//            String userResponse = scanner.next();
//
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userContinue = false;
//            }
//
//        }while (userContinue);
    }
}
