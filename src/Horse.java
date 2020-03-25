package LiveDemo;

import java.util.Scanner;

public class Horse {
    public boolean flowingMain;
    public boolean shoes;
    public String color;
    public String breed;
    private boolean lungExpanded;
    public static long numberOfHorses;
    private static Scanner scanner;

    public static void setScanner(Scanner s) {
        scanner = s;
    }

    public void letUserEnterColor() {
        System.out.println("Enter the horse color as a string: ");
        color = scanner.nextLine();
    }
    public static long getNumberOfHorses() {
        return numberOfHorses;
    }
    public void breath() {
        lungExpanded = true;
    }
    public void exhale() {
        lungExpanded = false;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Horse.setScanner(s);
        System.out.println(Horse.getNumberOfHorses());


        Horse myHorse = new Horse();
        myHorse.letUserEnterColor();
        myHorse.breath();
        System.out.printf("The color is: %s.\n", myHorse.color);
    }
}
