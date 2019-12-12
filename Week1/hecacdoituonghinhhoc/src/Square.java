public class Square extends Rectangle {
    public Square() {
    }

    public Square(double width) {
        super ( width );
    }

    public Square(String color, boolean filled, double width) {
        super ( color, filled, width );
    }

    public void setSide(double side) {
        super.setWidth ( side );
    }

    public double getside() {
        return super.getWidth ();
    }

    @Override
    public String toString() {
        return "A Square with width= " + super.getWidth () + "\n which is a subclass of " + super.toString ();
    }
}
