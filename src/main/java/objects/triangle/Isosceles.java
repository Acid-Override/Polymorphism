package objects.triangle;

import objects.Polygon;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class Isosceles extends AbstractTriangle {

    public Isosceles(BigDecimal leg, BigDecimal base) {
        setDimensions(leg, base);
        setHeight(calculateHeight());
        setAngles();
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    private BigDecimal calculateHeight() {
        MathContext mc = new MathContext(6);
        return ((getSideA().pow(2, mc)).subtract(getBase().pow(2, mc).divide(BigDecimal.valueOf(4)))).sqrt(mc).setScale(2, RoundingMode.HALF_UP);
    }

    private void setDimensions(BigDecimal leg, BigDecimal base) {
        setSideA(leg);
        setSideB(leg);
        setBase(base);
    }

    @Override
    protected void setAngles() {
        //        this.alphaAngle = ((getSideA().pow(2).add(getSideB().pow(2).subtract(getBase()))).divide(getSideA().multiply(getSideB().multiply(BigDecimal.valueOf(2))))).
        setAlphaAngle(BigDecimal.valueOf(
                        Math.toDegrees(
                                Math.acos(
                                        (Math.pow(getSideA().doubleValue(), 2) + Math.pow(getSideB().doubleValue(), 2) - Math.pow(getBase().doubleValue(), 2))
                                                /
                                                (2 * getSideA().doubleValue() * getSideB().doubleValue())
                                )))
                .setScale(2, RoundingMode.HALF_UP));
        setThetaAngle(BigDecimal.valueOf((180 - getAlphaAngle().doubleValue())/2).setScale(2, RoundingMode.HALF_UP));
        setOmegaAngle(getThetaAngle());
    }

    @Override
    protected BigDecimal calculateArea() {
        return getHeight().multiply(getBase()).multiply(BigDecimal.valueOf(0.5)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        return getSideA().add(getSideA()).add(getBase());
    }

    @Override
    public String toString() {
        return "Isosceles Triangle{" +
                "base = " + getBase() +
                ", legs = " + getSideA() +
                ", height = " + getHeight() +
                ", alpha angle = " + getAlphaAngle() +
                ", beta angles = " + getOmegaAngle() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                "}";
    }
}
