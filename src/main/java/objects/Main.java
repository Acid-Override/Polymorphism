package objects;

import objects.curve.Circle;
import objects.curve.Ellipse;
import objects.quadrilateral.Rectangle;
import objects.quadrilateral.Square;
import objects.triangle.Equilateral;
import objects.triangle.Isosceles;
import objects.triangle.RightTriangle;
import objects.triangle.Scalene;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = "";

        while (!inputString.equals("q")) {
            System.out.println("What would you like to compute the area/perimeter of:");
            System.out.println("1 -> Circle");
            System.out.println("2 -> Ellipse");
            System.out.println("3 -> Square");
            System.out.println("4 -> Rectangle");
            System.out.println("5 -> Right Triangle");
            System.out.println("6 -> Equilateral Triangle");
            System.out.println("7 -> Isosceles Triangle");
            System.out.println("8 -> Scalene Triangle");
            System.out.println("q -> quit");

            inputString = sc.nextLine();

//            if(inputString.equals("q"))
//                break;

            userInput(inputString);
        }
        System.out.println("Closing Application....");
    }

    private static void userInput(String inputString) {

        Scanner sc = new Scanner(System.in);


        switch (inputString) {
            case "1":
                System.out.println("Please enter the radius:");
                String radiusString = sc.nextLine();
                Shape circle = new Circle(new BigDecimal(radiusString));
                System.out.println(circle.toString());

                break;
            case "2":
                System.out.println("Please enter major axis :");
                String majorAxisString = sc.nextLine();
                System.out.println("Please enter minor axis :");
                String minorAxisString = sc.nextLine();

                BigDecimal major = new BigDecimal(majorAxisString);
                BigDecimal minor = new BigDecimal(minorAxisString);
                Shape ellipse = new Ellipse(major, minor);
                System.out.println(ellipse.toString());

                break;
            case "3":
                System.out.println("Please enter side length :");
                String sideString = sc.nextLine();

                double side = Double.parseDouble(sideString);
                Shape square = new Square(side);
                System.out.println(square.toString());

                break;
            case "4":
                System.out.println("Please enter minor length :");
                String minorLengthString = sc.nextLine();
                System.out.println("Please enter major length :");
                String majorLengthString = sc.nextLine();

                Shape rectangle = new Rectangle(Double.parseDouble(minorLengthString), Double.parseDouble(majorLengthString));
                System.out.println(rectangle.toString());

                break;
            case "5":
                System.out.println("Please enter base length :");
                String sideAString = sc.nextLine();
                System.out.println("Please enter height length :");
                String sideBString = sc.nextLine();

                BigDecimal sideA = new BigDecimal(sideAString);
                BigDecimal sideB = new BigDecimal(sideBString);

                Shape right = new RightTriangle(sideA, sideB);
                System.out.println(right.toString());

                break;
            case "6":
                System.out.println("Please enter side length :");
                String eqSideString = sc.nextLine();
                Shape equilateral = new Equilateral(new BigDecimal(eqSideString));
                System.out.println(equilateral.toString());

                break;
            case "7":
                System.out.println("Please enter leg length ");
                String isoLegLengthString = sc.nextLine();
                System.out.println("Please enter base length ");
                String isoBaseLengthString = sc.nextLine();

                BigDecimal isoLeg = new BigDecimal(isoLegLengthString);
                BigDecimal isoBase = new BigDecimal(isoBaseLengthString);
                Shape isosceles = new Isosceles(isoLeg, isoBase);
                System.out.println(isosceles.toString());

                break;
            case "8":
                System.out.println("Please enter length A :");
                String scaleneLengthA = sc.nextLine();
                System.out.println("Please enter length B :");
                String scaleneLengthB = sc.nextLine();
                System.out.println("Please enter length C :");
                String scaleneLengthC = sc.nextLine();

                BigDecimal dimensionA = new BigDecimal(scaleneLengthA);
                BigDecimal dimensionB = new BigDecimal(scaleneLengthB);
                BigDecimal dimensionC = new BigDecimal(scaleneLengthC);
                Shape scalene = new Scalene(dimensionA, dimensionB, dimensionC);
                System.out.println(scalene.toString());

                break;
        }
    }
}
