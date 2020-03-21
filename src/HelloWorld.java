//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.print("Hello, ");
//        System.out.print("World!");
//
//    }
//}

//After renaming the main method, received the following error:
//
//        Error: Main method not found in class HelloWorld, please define the main method as:
//public static void main(String[] args)
//        or a JavaFX application class must extend javafx.application.Application

//Running HelloWorld.java from a terminal using javac HelloWorld.java compiles program and creates a new file called HelloWorld.class ( this is compiled Java bytecode)

public class HelloWorld {
    public static void main(String[] args) {
//        int myFavoriteNumber;
//        String myString = "This is Guillermo's string output!";
//        char myString2 = 'A';
//        myFavoriteNumber = 10;
//        double myNumber;
//        myNumber = 3.14;
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);



//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        //prints out 5 on first line and 6 on next line

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //prints out 6 on first and second line


        // the 3 lines below give the following java error:
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at HelloWorld.main(HelloWorld.java:39)

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//          line below gives the following error:
//        Error:(46, 27) java: incompatible types: java.lang.String cannot be converted to int
//        int three = (int) "three";




//        System.out.println(myFavoriteNumber);
//        System.out.println(myString);
//        System.out.println(myString2);
//        System.out.println(myNumber);
    }
}

//adding  3.14 to String myString gave the following error:
//Error:(21, 27) java: incompatible types: double cannot be converted to java.lang.String

//assigning a character to string using "" gives no problems, but if you use single quote java will give error, so you should use char to assign a single character

// when trying to system.out myNumber without assigning a value, i get the following error:
//Error:(29, 28) java: variable myNumber might not have been initialized

//when assigning long myNumber = 3.14 getting the following error:
//Error:(25, 20) java: incompatible types: possible lossy conversion from double to long?
//3.14 is a double, can't be assigned to "long", but integer type can be assigned to "long", WHY?
//numeric types can assign a value of LESSER precision to a type of GREATER precision, but not the other way around.  I am assuming that "double" is of greater precision than "long" so a number of type double can't be assigned to "long", BUT "long" CAN be assigned to type "double"
//EXAMPLE         double myNumber2 = 123L;
//float myNumber = 3.14 gives java error, changing type to double myNumber fixes issue

//Exercise 13
//int x += 4;

//public static int addInts001(int a, int b) {
//
//    return a + b;
//        }

//public static double preformIndicatedOperation011(String operation, double op1, double op2) {
//        int results;
//        if(operation.equals("ADD")) {
//        results = op1 + op2;
//        } else if(operation.equals("SUB")) {
//        results = op1 - op2;
//        } else if(operation.equals("MUL")) {
//        results = op1 * op2;
//        } else if(operation.equals("DIV")) {
//        results = op1 / op2;
//        } else {
//            return 0;
//        }
//        return results;
//        }


//public static in getNearestIntegerToTheRealNumber(double firstRealAddend, double secondRealAddend) {
//        int output = (int) firstRealAddend + (int) secondRealAddend);
//        return output;
//        }

//public static int getNearestIntegerToRealSum013(double firstRealAddend, double secondRealAddend ) {
//        return int Math.rint(firstRealAddend + secondRealAddend);
//        }