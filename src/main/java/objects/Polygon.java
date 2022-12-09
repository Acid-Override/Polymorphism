package objects;


import java.math.BigDecimal;
import java.util.Objects;

public abstract class Polygon implements Shape {

    private final int numberOfSides;
    private BigDecimal area;
    private BigDecimal perimeter;

    protected Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    protected abstract BigDecimal calculateArea();
    protected abstract BigDecimal calculatePerimeter();

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

    public void setPerimeter(BigDecimal perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polygon)) return false;
        Polygon polygon = (Polygon) o;
        return getNumberOfSides() == polygon.getNumberOfSides() && getArea().equals(polygon.getArea()) && getPerimeter().equals(polygon.getPerimeter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfSides());
    }
}