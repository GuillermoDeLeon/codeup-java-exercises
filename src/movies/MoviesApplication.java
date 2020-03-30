package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    static Movie[] movieArray;
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What would you like to do? ");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");

        int movieChoice = reader.nextInt();

        if (movieChoice == 1) {
            System.out.println("Here are all of the movies: ");
            for (Movie movie : movieArray) {
                System.out.println(movie.getTitle());
            }

        } else {
            System.out.println("You exited");
        }

    }

}
