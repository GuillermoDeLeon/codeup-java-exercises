import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean userResponse = true;

        while(userResponse) {

            System.out.println("Bob Asks:  What do you want?");
            String userQuestion = input.nextLine();

            if (userQuestion.endsWith("?")) {
                System.out.println("Bob Says: Sure");
            } else if (userQuestion.endsWith("!")) {
                System.out.println("Bob Says: Whoa, chill out!");
            } else if (userQuestion.length() < 1) {
                System.out.println("Bob Says:  Fine, be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Do you want to ask Bob another question? y/n");
            String userConfirm = input.next().toLowerCase();

            if(!userConfirm.equalsIgnoreCase("y")) {
                userResponse = false;
            }
        }
    }
}
