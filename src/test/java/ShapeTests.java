import objects.*;
import objects.curve.Circle;
import objects.curve.Ellipse;
import objects.quadrilateral.Rectangle;
import objects.quadrilateral.Square;
import objects.triangle.Equilateral;
import objects.triangle.Isosceles;
import objects.triangle.RightTriangle;
import objects.triangle.Scalene;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeTests {

    @Test
    public void getCorrectPerimeterOfASquare(){
        Shape square = new Square(4);
        BigDecimal expectedPerimeter = BigDecimal.valueOf(16);
        assertEquals(0, expectedPerimeter.compareTo(square.getPerimeter()));
    }
    @Test
    public void getCorrectPerimeterOfACircle(){
        Circle circle = new Circle(new BigDecimal(7));
        BigDecimal expectedPerimeter = BigDecimal.valueOf(43.98);
        assertEquals(0, expectedPerimeter.compareTo(circle.getPerimeter()));
    }
    //EXTRA CREDIT
    @Test
    public void getTheCorrectAreaOfARectangle(){
        Shape rectangle = new Rectangle(2, 4);
        BigDecimal expectedArea = BigDecimal.valueOf(8);
        assertEquals(0, expectedArea.compareTo(rectangle.getArea()));
    }
    @Test
    public void getTheCorrectAreaOfACircle(){
        Ellipse circle = new Circle(new BigDecimal(3));
        BigDecimal expectedArea = BigDecimal.valueOf(28.27);
        assertEquals(0, expectedArea.compareTo(circle.getArea()));
    }
    @Test
    public void testIfTwoPolygonsAreEqual(){

        Polygon one = new Square(4);
        Polygon two = new Rectangle(4, 4);
        assertEquals(one,two);
    }
    @Test
    public void testIfTwoRectanglesWithOppositeDimensionsAreEqual() {
        Rectangle one = new Rectangle(2, 4);
        Rectangle two = new Rectangle(4, 2);
        assertEquals(one, two);
    }
    @Test
    public void testIfTwoEllipsesAreEqual(){
        //create two ellipses and compare them
        Shape ellipse = new Ellipse(new BigDecimal(4), new BigDecimal(4));
        Shape circle = new Circle(new BigDecimal(4));
        assertEquals(ellipse, circle);
    }

    //EXTRA EXTRA CREDIT
    //Create classes for Right and Isosceles triangles and find the perimeters and areas of each

    @Test
    public void getTheCorrectAreaOfAEquilateralTriangle() {
        Shape equilateral = new Equilateral(new BigDecimal(3));
        BigDecimal expectedArea = BigDecimal.valueOf(3.90);
        assertEquals(0, expectedArea.compareTo(equilateral.getArea()));
    }
    @Test
    public void getTheCorrectPerimeterOfAEquilateralTriangle() {
        Shape equilateral = new Equilateral(new BigDecimal(3));
        BigDecimal expectedPerimeter = BigDecimal.valueOf(9);
        assertEquals(0, expectedPerimeter.compareTo(equilateral.getPerimeter()));
    }
    @Test
    public void getTheCorrectAreaOfAIsoscelesTriangle() {
        Shape isosceles = new Isosceles(BigDecimal.valueOf(3), BigDecimal.valueOf(5));

        BigDecimal expectedArea = BigDecimal.valueOf(4.15);
        System.out.println(isosceles.getArea());
        assertEquals(0, expectedArea.compareTo(isosceles.getArea()));
    }

    @Test
    public void getTheCorrectAreaOfAScaleneTriangle() {
        Shape scalene = new Scalene(BigDecimal.valueOf(6), BigDecimal.valueOf(10), BigDecimal.valueOf(8));
        System.out.println(scalene);
        BigDecimal expectedArea = BigDecimal.valueOf(24);
        assertEquals(0, expectedArea.compareTo(scalene.getArea()));
    }

    @Test
    public void getTheCorrectAreaOfARightTriangle() {
        Shape right = new RightTriangle(BigDecimal.valueOf(6), BigDecimal.valueOf(8));
        System.out.println(right);
        BigDecimal expectedArea = BigDecimal.valueOf(24);
        assertEquals(0, expectedArea.compareTo(right.getArea()));
    }

    @Test
    public void testIfTwoTrianglesAreEqual () {
        Shape triangleOne = new RightTriangle(BigDecimal.valueOf(3), BigDecimal.valueOf(4));
        Shape triangleTwo = new Scalene(BigDecimal.valueOf(3), BigDecimal.valueOf(5), BigDecimal.valueOf(4));
        System.out.println(triangleOne);
        System.out.println(triangleTwo);
        assertEquals(0, triangleOne.getArea().compareTo(triangleTwo.getArea()));
    }

    @Test
    public void testIfEquilateralAndScaleneAreEqual() {
        Shape equilateral = new Equilateral(BigDecimal.valueOf(4));
        Shape scalene = new Scalene(BigDecimal.valueOf(4), BigDecimal.valueOf(4), BigDecimal.valueOf(4));
        System.out.println(equilateral);
        System.out.println(scalene);
//        boolean result = Objects.equals(equilateral, scalene);
        assertEquals(equilateral, scalene);
    }




}
