package shapes;
public class Circle{
    private double radius;

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius;
    }

    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }
}