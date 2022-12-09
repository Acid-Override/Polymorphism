package objects.triangle;

import objects.Shape;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Scalene extends AbstractTriangle {

    RightTriangle rightPairOne;
    RightTriangle rightPairTwo;


    public Scalene(BigDecimal sideA, BigDecimal sideB, BigDecimal sideC) {
        setDimensions(sideA, sideB, sideC);
        setHeight(calculateHeight());
        createRightTrianglePairs();
        setAngles();
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    private void createRightTrianglePairs() {
        BigDecimal partialLegDimension = calculatePartialLeg();
        rightPairOne = new RightTriangle(partialLegDimension, getHeight());
        rightPairTwo = new RightTriangle(getHeight(), getSideB().subtract(partialLegDimension));
    }

    private BigDecimal calculatePartialLeg() {
        MathContext mc = new MathContext(4);
        return (getSideC().pow(2).subtract(getHeight().pow(2))).sqrt(mc);
    }

    private void setDimensions(BigDecimal sideA, BigDecimal sideB, BigDecimal sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    private BigDecimal calculateHeight() {
        return BigDecimal.valueOf((0.5 / getSideB().doubleValue()) *
                Math.sqrt(getSideA().doubleValue() + getSideB().doubleValue() + getSideC().doubleValue()) *
                Math.sqrt(-1 * getSideA().doubleValue() + getSideB().doubleValue() + getSideC().doubleValue()) *
                Math.sqrt(getSideA().doubleValue() - getSideB().doubleValue() + getSideC().doubleValue()) *
                Math.sqrt(getSideA().doubleValue() + getSideB().doubleValue() - getSideC().doubleValue()));
    }

    @Override
    protected void setAngles() {
        setAlphaAngle(rightPairOne.getThetaAngle());
        setOmegaAngle(rightPairOne.getAlphaAngle().add(rightPairTwo.getThetaAngle()));
        setThetaAngle(rightPairTwo.getAlphaAngle());
    }

    @Override
    protected BigDecimal calculateArea() {
        return rightPairOne.getArea().add(rightPairTwo.getArea());
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        return getSideA().add(getSideB()).add(getSideC());
    }

    @Override
    public String toString() {
        return "Scalene{" +
                "side A = " + getSideA() +
                ", side B = " + getSideB() +
                ", side C = " + getSideC() +
                ", angle alpha =" + getAlphaAngle() +
                ", angle theta =" + getThetaAngle() +
                ", angle omega =" + getOmegaAngle() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                "}";
    }
}
