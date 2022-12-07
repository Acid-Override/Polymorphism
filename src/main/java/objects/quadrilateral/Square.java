package objects.quadrilateral;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + super.getLength() +
                ", area = " + super.getArea() +
                ", perimeter = " + super.getPerimeter() +
                "}";
    }
}
