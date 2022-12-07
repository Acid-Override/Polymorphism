package objects.triangle;

import objects.Polygon;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractTriangle extends Polygon {

    private double sideA;
    private double sideB;
    private double sideC;
    private BigDecimal base;
    private BigDecimal height;
    private BigDecimal hypotenuse;

    private BigDecimal alphaAngle;
    private BigDecimal thetaAngle;
    private BigDecimal omegaAngle;

    private BigDecimal semiPerimeter;
    private BigDecimal area;
    private BigDecimal perimeter;

    protected AbstractTriangle() {
        super(3);
    }

    protected AbstractTriangle(double sideA, double sideB, double sideC) {
        super(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public AbstractTriangle(double side) {
        super(3);
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;

//        this.alphaAngle = 60.0;
//        this.thetaAngle = 60.0;
//        this.omegaAngle = 60.0;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideC(double sideC) {
        BigDecimal bde = new BigDecimal(sideC).setScale(6, RoundingMode.HALF_UP);
        this.sideC = bde.doubleValue();
    }
    public double getSideC() {
        return sideC;
    }

    public BigDecimal getBase() {
        return base;
    }
    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public BigDecimal getHeight() {
        return height;
    }
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getHypotenuse() {
        return hypotenuse;
    }
    public void setHypotenuse(BigDecimal hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public void setAlphaAngle(BigDecimal alphaAngle) {
        this.alphaAngle = alphaAngle;
    }
    public BigDecimal getAlphaAngle() {
        return alphaAngle;
    }

    public void setThetaAngle(BigDecimal thetaAngle) {
        this.thetaAngle = thetaAngle;
    }
    public BigDecimal getThetaAngle() {
        return thetaAngle;
    }

    public void setOmegaAngle(BigDecimal omegaAngle) {
        this.omegaAngle = omegaAngle;
    }
    public BigDecimal getOmegaAngle() {
        return omegaAngle;
    }

    public BigDecimal getSemiPerimeter() {
        return semiPerimeter;
    }


    public void setPerimeter(BigDecimal perimeter) {
        this.perimeter = perimeter;
    }


    @Override
    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Override
    public BigDecimal getPerimeter() {
        return perimeter;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "base = " + getBase() +
                ", height = " + getHeight() +
                ", hypotenuse = " + getHypotenuse() +
                ", angle alpha =" + getAlphaAngle() +
                ", angle theta =" + getThetaAngle() +
                ", angle omega =" + getOmegaAngle() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                "}";
    }
}
