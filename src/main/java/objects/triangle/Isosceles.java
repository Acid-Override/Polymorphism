package objects.triangle;

import objects.Polygon;

import java.util.Arrays;

public class Isosceles extends Polygon {

    public Isosceles(double leg, double base) {
        super(leg, leg, base);
        if( leg <= 0 || base <= 0)
            throw new RuntimeException("Invalid dimensions for Isosceles Triangle.");
        double alpha = Math.toDegrees(Math.acos(base / (2 * leg)));
        setAnglesList(Arrays.asList(alpha, alpha, 180.0 - (2 * alpha) ));
    }

}
