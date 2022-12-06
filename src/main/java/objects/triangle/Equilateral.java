package objects.triangle;

import objects.Polygon;

import java.util.Arrays;

public class Equilateral extends Polygon {

    public Equilateral(double side) {
        super(side, side, side);
        if(side <= 0)
            throw new RuntimeException("Invalid dimension for Equilateral.");
        this.setAnglesList(Arrays.asList(60.0, 60.0, 60.0));
    }

}
