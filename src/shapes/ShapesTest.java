package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5);
        myShape = new Rectangle(5, 4);

        System.out.println("myShape.getArea() " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());


    //Below exercises are for Inheritance and Polymorphism section

//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());  //returns 25
//        System.out.println(box2.getPerimeter()); //returns 20

    }

}
