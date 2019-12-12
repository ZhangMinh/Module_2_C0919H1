public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width) {
        super ( color, filled );
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + this.width + "and length" + this.length + "\n which is a subclass of "+super.toString ();
    }

    @Override
    public double resize(double percent) {
        return this.getArea ()*percent/100;
    }
}
