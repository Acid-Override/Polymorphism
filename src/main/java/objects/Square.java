package objects;

import java.util.Arrays;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
        if(side <= 0)
            throw new RuntimeException("Invalid dimension for Square.");
        setAnglesList(Arrays.asList(90.0, 90.0, 90.0, 90.0));

    }

}
