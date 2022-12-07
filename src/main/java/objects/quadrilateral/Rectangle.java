package objects.quadrilateral;

import objects.Polygon;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Polygon {

    private final BigDecimal length;
    private final BigDecimal width;


    public Rectangle(double length, double width) {
       super(4);

       this.length = BigDecimal.valueOf(length);
       this.width = BigDecimal.valueOf(width);

        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    public BigDecimal getLength() {
        return length;
    }

    @Override
    protected BigDecimal calculateArea() {
        return width.multiply(length).setScale(2, RoundingMode.HALF_UP);
    }
    @Override
    protected BigDecimal calculatePerimeter() {
        return length.multiply(BigDecimal.valueOf(2)).add(width.multiply(BigDecimal.valueOf(2))).setScale(2, RoundingMode.HALF_UP);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
