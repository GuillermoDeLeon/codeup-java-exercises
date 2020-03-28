package util;

import java.util.Scanner;

//Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//        String getString() --done
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all of the methods from the Input class.

//public class Input {
////    public static void main(String[] args) {
////        System.out.println("text1");
////    }
//
//    private Scanner scanner;
//
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
//    public String getString() {
//        System.out.println("Enter string input (from the getString method): ");
//        return this.scanner.nextLine();
//    }
//
//    public Boolean yesNo() {
//        System.out.println("[y/n]");
//        if(getString().equalsIgnoreCase("y")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, in max) {
//        System.out.println("From getInt() ");
//
//    }
//
//
//}
