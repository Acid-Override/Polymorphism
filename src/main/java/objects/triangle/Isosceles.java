package objects.triangle;

import objects.Polygon;

import java.math.BigDecimal;
import java.util.Arrays;

public class Isosceles extends AbstractTriangle {

    public Isosceles(double leg, double base) {


        double alpha = Math.toDegrees(Math.acos(base / (2 * leg)));
//        setAnglesList(Arrays.asList(alpha, alpha, 180.0 - (2 * alpha) ));
    }

    @Override
    protected BigDecimal calculateArea() {
        return null;
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        return null;
    }
}
