package objects.triangle;

import objects.Polygon;

import java.util.Arrays;
import java.util.Collections;

public class Scalene extends Polygon {

    public Scalene(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);

        if(sideA == sideB || sideB == sideC || sideC == sideA || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new RuntimeException("Invalid dimensions for a Scalene Triangle.");
        }

        double a = getDimensionsList().get(0); //base
        double b = getDimensionsList().get(1);
        double c = getDimensionsList().get(2);

        double alpha = Math.toDegrees(Math.asin(b/c));
        double beta = Math.toDegrees(Math.asin(a/c));

        setAnglesList(Arrays.asList(alpha, beta, 180 - (alpha + beta)));
    }
}
