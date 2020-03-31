package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}

//Below exercises are for Inheritance and Polymorphism section

//public class Square extends Rectangle {
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        System.out.println("Square getArea");
//        return 4 * super.width;
//    }
//
//    public double getPerimeter() {
//        System.out.println("Square getPerimeter");
//        return Math.pow(super.length, 2);
//    }
//
//
//}
