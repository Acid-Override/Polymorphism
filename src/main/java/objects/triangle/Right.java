package objects.triangle;

import objects.Polygon;

import java.util.Arrays;

public class Right extends Polygon {

    public Right (double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);

        if(sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new RuntimeException("Invalid dimensions for a Scalene Triangle.");
        }

        double a = getDimensionsList().get(0);
        double b = getDimensionsList().get(1);
        double c = getDimensionsList().get(2);

        double alpha = Math.toDegrees(Math.asin(b/c));
        double beta = Math.toDegrees(Math.asin(a/c));

        setAnglesList(Arrays.asList(180 - (alpha + beta), alpha, beta));

    }
}
