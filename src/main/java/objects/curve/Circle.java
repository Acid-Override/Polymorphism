package objects.curve;


import objects.curve.Ellipse;

import java.math.BigDecimal;

public class Circle extends Ellipse {

    public Circle(BigDecimal radius) {
        super(radius, radius);
    }

}
