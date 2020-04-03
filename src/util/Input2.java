//package util;
//
//import java.text.NumberFormat;
//import java.util.Scanner;
//
////Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
////
////        String getString() --done
////        boolean yesNo()
////        int getInt(int min, int max)
////        int getInt()
////        double getDouble(double min, double max)
////        double getDouble()
////        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
////
////        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
////
////        Create another class named InputTest that has a static main method that uses all of the methods from the Input class.
//
//public class Input {
//    public static void main(String[] args) {
//        Input s = new Input();
//
//        System.out.println("text1");
//        System.out.println(s.yesNo("yes or no"));
//    }
//
//    private Scanner scanner;
//
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
////    public static void setScanner(Scanner scanner) {
////    }
//
//    public String getString() {
//        String userInput;
//        do {
//            userInput = this.scanner.nextLine();
//        } while (userInput.equals(""));
//        return userInput;
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        String userInput;
//        do {
//            userInput = this.scanner.nextLine();
//        } while (userInput.equals(""));
//        return userInput;
//    }
//
//    public boolean yesNo() {
//
//        System.out.println("What is your answer? (yes/no)");
//        String response = this.scanner.next();
//        return (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")  );
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        String response = this.scanner.next();
//        return (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")  );
//    }
//
//    public int getInt(int min, int max) {
//        String userInput;
//        try {
//            do {
//                System.out.printf("Enter number between %d and %d: ", min, max);
//                userInput = this.scanner.nextLine();
//                Integer.valueOf(userInput);
//            } while (Integer.parseInt(userInput) > max || Integer.parseInt(userInput) < min);
//        } catch (NumberFormatException e) {
//            System.out.println("Enter a valid integer:  ");
//            return getInt(min, max);
//        }
//        return Integer.parseInt(userInput);
//    }
//
////    public int getInt() {
////        System.out.println("Input a number: ");
////        int input = scanner.nextInt();
////        System.out.println("Your input was " + input);
////        return input;
////    }
//
//
//}
