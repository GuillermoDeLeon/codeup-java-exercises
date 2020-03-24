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

        System.out.println(getInteger(1,10));



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
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num >= min && num <= max) {
            return num;
        } else {
            System.out.println("This number is not within range.  Try again");
            return getInteger(min, max);
        }
    }

}


