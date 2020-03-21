import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        //Problem Scanner 1

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter an integer ");
//        int userInt = scanner.nextInt();
//        System.out.println("Please enter an integer ");  //this line has to go before int userInt for some reason
//        System.out.println(userInt);

        //Problem Scanner 2

//        System.out.println("Please enter 3 words");
//
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.printf("%s%n", wordOne);
//        System.out.printf("%s%n", wordTwo);
//        System.out.printf("%s%n", wordThree);

        //Problem Scanner 3 and 4

//        System.out.println("Enter a sentence");
//
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        //Problem Calculate 1

        System.out.println("Enter length and width of your room:");
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length entered is %d and the width entered is %d%n", length, width);

        int area = length * width;
        int perimeter = (2*width) + (2*length);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }

}
