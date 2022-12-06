package objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Polygon implements Shape {

    private int numberOfSides;
    private List<Double> anglesList = new ArrayList<>();
    private List<Double> distinctAnglesList = new ArrayList<>();
    private List<Double> dimensionsList = new ArrayList<>();
    private List<Double> distinctDimensionList = new ArrayList<>();

    //Quadrilateral Constructor
    public Polygon(double dimensionOne, double dimensionTwo, double dimensionThree, double dimensionFour) {
        dimensionsList.add(dimensionOne);
        dimensionsList.add(dimensionTwo);
        dimensionsList.add(dimensionThree);
        dimensionsList.add(dimensionFour);
        setNumberOfSides(dimensionsList.size());
        setDistinctDimensionList();
        setDistinctAnglesList();
    }

    //Circle and Ellipse Constructor
    public Polygon(double aAxis, double bAxis) {
        dimensionsList.add(aAxis);
        dimensionsList.add(bAxis);
        setNumberOfSides(1);
    }

    //Triangle Constructor
    public Polygon(double sideA, double sideB, double sideC) {
        dimensionsList.add(sideA);
        dimensionsList.add(sideB);
        dimensionsList.add(sideC);
        setNumberOfSides(3);
//        Collections.sort(dimensionsList);
        setDistinctDimensionList();
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public List<Double> getDimensionsList() {
        return dimensionsList;
    }

    private void setDistinctDimensionList() {
        this.distinctDimensionList = dimensionsList.stream().distinct().collect(Collectors.toList());;
    }

    public void setAnglesList(List<Double> anglesList) {
        double angleListTotalValue = anglesList.stream().mapToDouble(Double::doubleValue).sum();
        if(anglesList.size() == 3 && angleListTotalValue != 180.0)
            throw new RuntimeException("Invalid triangle angles.");
        if(anglesList.size() == 4 && angleListTotalValue != 360.0)
            throw new RuntimeException("Invalid quadrilateral angles.");
        if(anglesList.contains(0.0))
            throw new RuntimeException("Incorrect dimensions for Right Triangle");
        this.anglesList = anglesList;
        setDistinctAnglesList();
    }

    private void setDistinctAnglesList() {
        this.distinctAnglesList = anglesList.stream().distinct().sorted().collect(Collectors.toList());
        Collections.sort(distinctAnglesList, Collections.reverseOrder());
    }

    @Override
    public double getPerimeter() {
        double result = 0;

        switch (numberOfSides) {
            //circle
            case 1:
                result = 2 * Math.PI * Math.sqrt((Math.pow(dimensionsList.get(0), 2) + Math.pow(dimensionsList.get(1), 2)) / 2);
                break;
            // all other multi-sided shapes
            default:
                result = dimensionsList.stream().reduce(0.0, Double::sum);
                break;
        }
        return result;
    }

    @Override
    public double getArea() {
        double result = 0;

        switch (numberOfSides) {
            // circle
            case 1:
                result = dimensionsList.stream().reduce(Math.PI, (acc, num) -> acc * num);
                break;
            // triangle (Using Heron's Formula)
            case 3:
                result = getTriangleArea();
                break;
            // 4 right angle sides polygon
            case 4:
                result = getQuadArea();
                break;
            default:
                //TODO - remember to do something
                //FIXME - demo
        }
        return result;
    }

    private double getTriangleArea() {
        double result = 0;
        double s = dimensionsList.stream().mapToDouble(Double::doubleValue).sum() / 2;

        switch(distinctDimensionList.size()) {
            //Equilateral
            case 1:
                //Heron's Formula
                result = Math.sqrt(dimensionsList.stream().reduce(s, (acc, value) -> acc * (s - value)));
                break;
            //Isosceles
            case 2:
                double leg = dimensionsList.get(0);
                double base = dimensionsList.get(2);
                result = (base/4) * Math.sqrt(4 * Math.pow(leg, 2) - Math.pow(base, 2));
                break;
            //Right and Scalene
            case 3:
                //Heron's Formula
                result = 0.5 * dimensionsList.get(0) * (2/dimensionsList.get(0) * Math.sqrt(dimensionsList.stream().reduce(s, (acc, value) -> acc * (s - value))));
                break;
        }


        return result;
    }

    private double getQuadArea() {
        double result = 0;

        //rectangle or square
        if (distinctAnglesList.contains(90.0) && distinctAnglesList.size() == 1) {
            if (distinctDimensionList.size() == 2) {  // can only have two distinct lengths for a rectangle
                result = distinctDimensionList.stream().reduce(1.0, (acc, value) -> acc * value);
            } else {  //it's a square
                result = dimensionsList.stream().limit(2).reduce(1.0, (acc, value) -> acc * value);
            }
        } else if (distinctAnglesList.contains(90.0) && distinctAnglesList.size() > 1) {  //Rhombus
            System.out.println("Rhombus?");

        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        //is area a necessary check if we have the dimensions ?  area is based on dimensions.
        return this.getNumberOfSides() == polygon.getNumberOfSides() && this.getDimensionsList().equals(polygon.getDimensionsList()) && this.getPerimeter() == polygon.getPerimeter() && this.getArea() == polygon.getArea();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSides);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "numberOfSides = " + numberOfSides +
                ", dimensions = " + dimensionsList +
                ", angles = " + anglesList +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
