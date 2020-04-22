package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("What is the radius of the circle?");
        Circle circle = new Circle(radius);
        System.out.println("Area of circle = " + circle.getArea());
        System.out.println("Circumfrance = " + circle.getCircumference());
    }
}