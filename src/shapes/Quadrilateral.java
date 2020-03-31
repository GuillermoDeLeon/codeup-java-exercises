package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {  //method for getting length
        return this.length;
    }

    public double getWidth() { // method for getting width
        return this.width;
    }

    public abstract void setLength(double length); //abstract method for setting length

    public abstract void setWidth(double width);  //abstract method for setting width

    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }


}
