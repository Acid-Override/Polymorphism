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























//    private double getTriangleArea() {
//        double result = 0;
//        double s = dimensionsList.stream().mapToDouble(Double::doubleValue).sum() / 2;
//
//        switch(distinctDimensionList.size()) {
//            //Equilateral
//            case 1:
//                //Heron's Formula
//                result = Math.sqrt(dimensionsList.stream().reduce(s, (acc, value) -> acc * (s - value)));
//                break;
//            //Isosceles
//            case 2:
//                double leg = dimensionsList.get(0);
//                double base = dimensionsList.get(2);
//                result = (base/4) * Math.sqrt(4 * Math.pow(leg, 2) - Math.pow(base, 2));
//                break;
//            //Right and Scalene
//            case 3:
//                //Heron's Formula
//                result = 0.5 * dimensionsList.get(0) * (2/dimensionsList.get(0) * Math.sqrt(dimensionsList.stream().reduce(s, (acc, value) -> acc * (s - value))));
//                break;
//        }
//
//
//        return result;
//    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
//        Polygon polygon = (Polygon) o;
//        //is area a necessary check if we have the dimensions ?  area is based on dimensions.
//        return this.getNumberOfSides() == polygon.getNumberOfSides() && this.getDimensionsList().equals(polygon.getDimensionsList()) && this.getPerimeter() == polygon.getPerimeter() && this.getArea() == polygon.getArea();
//    }

