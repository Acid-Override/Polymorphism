import objects.*;
import objects.triangle.Equilateral;
import objects.triangle.Isosceles;
import objects.triangle.Right;
import objects.triangle.Scalene;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTests {

    //for the purpose of this pi = 3.14

    @Test
    public void getCorrectPerimeterOfASquare(){
        //you need to implement a "Rectangle" and a "Square" class
        Shape square = new Square(4);

        //set the length of a side to 4

        double expectedPerimeter = 16;
        assertEquals(expectedPerimeter,square.getPerimeter());
    }

    @Test
    public void getCorrectPerimeterOfACircle(){
        Circle circle = new Circle(7);
        BigDecimal bde = new BigDecimal(circle.getPerimeter()).setScale(2, RoundingMode.UP);

        //set the radius of the circle

        double expectedPerimeter = 43.99;
        assertEquals(expectedPerimeter, bde.doubleValue());
    }

    //EXTRA CREDIT
    @Test
    public void getTheCorrectAreaOfARectangle(){
        Shape rectangle = new Rectangle(2, 4);

        //sides of the rectangle = 2 x 4


        double expectedArea = 8;
        assertEquals(expectedArea,rectangle.getArea());
    }

    @Test
    public void getTheCorrectAreaOfACircle(){
        Ellipse circle = new Circle(3);

        //set the radius of the circle

        BigDecimal bde = new BigDecimal(circle.getArea()).setScale(2, RoundingMode.HALF_UP);

        double expectedArea = 28.27;
        assertEquals(expectedArea,bde.doubleValue());
    }



    @Test
    public void testIfTwoPolygonsAreEqual(){
        //create two polygons and compare them
        Polygon one = new Square(4);
        Polygon two = new Rectangle(4, 4);
        assertEquals(one,two);
    }

    @Test
    public void testIfTwoEllipsesAreEqual(){
        //create two ellipses and compare them
        Ellipse ellipse = new Ellipse(4, 4);
        Ellipse circle = new Circle(4);
        assertEquals(ellipse, circle);
    }

    //EXTRA EXTRA CREDIT
    //Create classes for Right and Isosceles triangles and find the perimeters and areas of each

    @Test
    public void getTheCorrectAreaOfAEquilateralTriangle() {
        Shape equilateral = new Equilateral(3);

        BigDecimal bde = new BigDecimal(equilateral.getArea()).setScale(2, RoundingMode.HALF_UP);

        double expectedArea = 3.90;
        assertEquals(expectedArea, bde.doubleValue());
    }

    @Test
    public void getTheCorrectAreaOfAIsoscelesTriangle() {
        Shape isosceles = new Isosceles(3, 5);

        BigDecimal bde = new BigDecimal(isosceles.getArea()).setScale(2, RoundingMode.HALF_UP);

        double expectedArea = 4.15;
        assertEquals(expectedArea, bde.doubleValue());
    }

    @Test
    public void getTheCorrectAreaOfAScaleneTriangle() {
        Shape scalene = new Scalene(6, 8, 10);

        BigDecimal bde = new BigDecimal(scalene.getArea()).setScale(2, RoundingMode.HALF_UP);

        double expectedArea = 24.0;
        assertEquals(expectedArea, bde.doubleValue());
    }

    @Test
    public void getTheCorrectAreaOfARightTriangle() {
        Shape right = new Right(3, 4, 5);

        double expectedArea = 6;
        assertEquals(expectedArea, right.getArea());
    }

    @Test
    public void testIfTwoTrianglesAreEqual () {
        Shape equilateral = new Equilateral(4);
        Shape equilateralTwo = new Equilateral(4);
        assertEquals(equilateral, equilateralTwo);
    }

    @Test
    public void testIfRightAndScaleneAreEqual() {
        Shape right = new Right(3, 4, 5);
        Shape scalene = new Scalene(3, 4, 5);
        assertEquals(right, scalene);
    }




}
