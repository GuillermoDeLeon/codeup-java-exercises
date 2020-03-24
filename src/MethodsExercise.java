import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
//        System.out.println(addition(10, 11));
//        System.out.println(subtraction(5, 10));
//        System.out.println(multiplication(3, 10));
//        System.out.println(division(3, 9));
//        System.out.println(modulus(2, 3));
        //when trying to divide by 0, get Exception error
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at MethodsExercise.division(MethodsExercise.java:28)
//        at MethodsExercise.main(MethodsExercise.java:9)
//        System.out.println(division(0, 10));

//        System.out.println(getInteger(1,10));

//        System.out.println(factorial());

    rollDice();

    }

    //Exercise 1 a, b, c, d

//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num2 - num1;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int division(int num1, int num2) {
//        return num2 / num1;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num2 % num1;
//    }

    //Exercise 2
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        if(num >= min && num <= max) {
//            return num;
//        } else {
//            System.out.println("This number is not within range.  Try again");
//            return getInteger(min, max);
//        }
//    }

    //Exercise 3

//    public static long factorial() {
//        System.out.println("Enter a number between 1 and 10");
//        Scanner input = new Scanner(System.in);
//        int userNum = input.nextInt();
//        long result = 1;
//
//        for (var i = userNum; i >= 1; i--) {
//            result = result * i;
//        }
//        return result;
//    }


// Exercise 4

    public static int rollDice() {
        System.out.println("Please enter a number which will represent the number of sides on each of two dice: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.print(userInput);

        boolean userRolls = true

        while(userRolls) {



            System.out.println("Would you like to roll the dice? y - yes, n - no");

        }


        return userInput;

    }

}

