package objects.triangle;

import java.math.BigDecimal;

public class Equilateral extends Isosceles {

    public Equilateral(BigDecimal side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Equilateral Triangle{" +
                "legs = " + getBase() +
                ", height = " + getHeight() +
                ", angles = " + getAlphaAngle() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                "}";
    }
}
