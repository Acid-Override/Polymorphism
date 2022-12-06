package objects;

import java.util.Arrays;

public class Rectangle extends Polygon {

    public Rectangle(double length, double width) {
        super(length, length, width, width);
        if(length <= 0 || width <= 0)
            throw new RuntimeException("Invalid dimensions for Rectangle.");
        super.setAnglesList(Arrays.asList(90.0, 90.0, 90.0, 90.0));
    }


}
