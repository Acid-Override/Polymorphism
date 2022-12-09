package objects.curve;

import objects.Polygon;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ellipse extends Polygon {

    private final BigDecimal majorAxis;
    private final BigDecimal minorAxis;


    public Ellipse(BigDecimal aAxis, BigDecimal bAxis) {
        super(1);
        this.majorAxis = aAxis;
        this.minorAxis = bAxis;

        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        MathContext mc = new MathContext(2);
        BigDecimal result = ((
                ((majorAxis.pow(2).add(minorAxis.pow(2)))
                        .multiply(BigDecimal.valueOf(2))).sqrt(mc))
                .multiply(BigDecimal.valueOf(Math.PI).setScale(6, RoundingMode.HALF_UP)))
                .setScale(2, RoundingMode.HALF_UP);

        return result;
    }

    @Override
    public BigDecimal calculateArea() {
        return (majorAxis.multiply(minorAxis)).multiply(BigDecimal.valueOf(Math.PI).setScale(6, RoundingMode.HALF_UP)).setScale(2, RoundingMode.HALF_UP);
    }


    @Override
    public String toString() {
        return "Ellipse{" +
                "majorAxis=" + majorAxis +
                ", minorAxis=" + minorAxis +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }


}
