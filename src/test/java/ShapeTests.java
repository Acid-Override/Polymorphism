import objects.*;
import objects.curve.Circle;
import objects.curve.Ellipse;
import objects.quadrilateral.Rectangle;
import objects.quadrilateral.Square;
//import objects.triangle.Equilateral;
//import objects.triangle.Isosceles;
import objects.triangle.RightTriangle;
//import objects.triangle.Scalene;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeTests {

    //for the purpose of this pi = 3.14

    @Test
    public void getCorrectPerimeterOfASquare(){
        Shape square = new Square(4);
        BigDecimal expectedPerimeter = BigDecimal.valueOf(16);
        assertEquals(0, expectedPerimeter.compareTo(square.getPerimeter()));
    }
    @Test
    public void getCorrectPerimeterOfACircle(){
        Circle circle = new Circle(7);
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
        Ellipse circle = new Circle(3);
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
        Shape ellipse = new Ellipse(4, 4);
        Shape circle = new Circle(4);
        assertEquals(ellipse, circle);
    }

    //EXTRA EXTRA CREDIT
    //Create classes for Right and Isosceles triangles and find the perimeters and areas of each

//    @Test
//    public void getTheCorrectAreaOfAEquilateralTriangle() {
//        Shape equilateral = new Equilateral(3);
//
//        BigDecimal bde = new BigDecimal(equilateral.getArea()).setScale(2, RoundingMode.HALF_UP);
//
//        double expectedArea = 3.90;
//        assertEquals(expectedArea, bde.doubleValue());
//    }
//
//    @Test
//    public void getTheCorrectAreaOfAIsoscelesTriangle() {
//        Shape isosceles = new Isosceles(3, 5);
//
//        BigDecimal bde = new BigDecimal(isosceles.getArea()).setScale(2, RoundingMode.HALF_UP);
//
//        double expectedArea = 4.15;
//        assertEquals(expectedArea, bde.doubleValue());
//    }
//
//    @Test
//    public void getTheCorrectAreaOfAScaleneTriangle() {
//        Shape scalene = new Scalene(6, 8, 10);
//
//        BigDecimal bde = new BigDecimal(scalene.getArea()).setScale(2, RoundingMode.HALF_UP);
//
//        double expectedArea = 24.0;
//        assertEquals(expectedArea, bde.doubleValue());
//    }

    @Test
    public void getTheCorrectAreaOfARightTriangle() {
        Shape right = new RightTriangle(3, 3);
        BigDecimal expectedArea = BigDecimal.valueOf(4.5);
        assertEquals(0, expectedArea.compareTo(right.getArea()));
    }

//    @Test
//    public void testIfTwoTrianglesAreEqual () {
//        Shape equilateral = new Equilateral(4);
//        Shape equilateralTwo = new Equilateral(4);
//        assertEquals(equilateral, equilateralTwo);
//    }
//
//    @Test
//    public void testIfRightAndScaleneAreEqual() {
//        Shape right = new Right(3, 4, 5);
//        Shape scalene = new Scalene(3, 4, 5);
//        assertEquals(right, scalene);
//    }




}
