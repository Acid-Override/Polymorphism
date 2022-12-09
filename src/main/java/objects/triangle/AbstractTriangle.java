package objects.triangle;

import objects.Polygon;

import java.math.BigDecimal;

public abstract class AbstractTriangle extends Polygon {

    private BigDecimal sideA;
    private BigDecimal sideB;
    private BigDecimal sideC;
    private BigDecimal base;
    private BigDecimal height;
    private BigDecimal hypotenuse;

    private BigDecimal alphaAngle;
    private BigDecimal thetaAngle;
    private BigDecimal omegaAngle;

    private BigDecimal area;
    private BigDecimal perimeter;

    protected AbstractTriangle() {
        super(3);
    }


    public void setSideA(BigDecimal sideA) {
        this.sideA = sideA;
    }

    public BigDecimal getSideA() {
        return sideA;
    }

    public void setSideB(BigDecimal sideB) {
        this.sideB = sideB;
    }

    public BigDecimal getSideB() {
        return sideB;
    }

    public void setSideC(BigDecimal sideC) {
        this.sideC = sideC;
    }

    public BigDecimal getSideC() {
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

    protected abstract void setAngles();

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
