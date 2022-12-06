package objects;

import objects.triangle.Equilateral;
import objects.triangle.Isosceles;
import objects.triangle.Right;
import objects.triangle.Scalene;

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
                try {
                double radius = Double.parseDouble(radiusString);
                    Shape circle = new Circle(radius);
                    System.out.println(circle.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
//                    e.printStackTrace();
                }
                break;
            case "2":
                System.out.println("Please enter major axis :");
                String majorAxisString = sc.nextLine();
                System.out.println("Please enter minor axis :");
                String minorAxisString = sc.nextLine();
                try {
                    double major = Double.parseDouble(majorAxisString);
                    double minor = Double.parseDouble(minorAxisString);
                    Shape ellipse = new Ellipse(major, minor);
                    System.out.println(ellipse.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                }
                break;
            case "3":
                System.out.println("Please enter side length :");
                String sideString = sc.nextLine();
                try {
                    double side = Double.parseDouble(sideString);
                    Shape square = new Square(side);
                    System.out.println(square.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                }
                break;
            case "4":
                System.out.println("Please enter minor length :");
                String minorLengthString = sc.nextLine();
                System.out.println("Please enter major length :");
                String majorLengthString = sc.nextLine();
                try {
                    double major = Double.parseDouble(majorLengthString);
                    double minor = Double.parseDouble(minorLengthString);
                    Shape rectangle = new Rectangle(minor, major);
                    System.out.println(rectangle.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                }
                break;
            case "5":
                System.out.println("Please enter side A length :");
                String sideAString = sc.nextLine();
                System.out.println("Please enter side B length :");
                String sideBString = sc.nextLine();
                System.out.println("Please enter side C length :");
                String sideCString = sc.nextLine();
                try {
                    double sideA = Double.parseDouble(sideAString);
                    double sideB = Double.parseDouble(sideBString);
                    double sideC = Double.parseDouble(sideCString);
                    Shape right = new Right(sideA, sideB, sideC);
                    System.out.println(right.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                    System.out.println(e.getMessage());
                }
                break;
            case "6":
                System.out.println("Please enter side length :");
                String eqSideString = sc.nextLine();
                try {
                    double side = Double.parseDouble(eqSideString);
                    Shape equilateral = new Equilateral(side);
                    System.out.println(equilateral.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                    System.out.println(e.getMessage());
                }
                break;
            case "7":
                System.out.println("Please enter leg length ");
                String isoLegLengthString = sc.nextLine();
                System.out.println("Please enter base length ");
                String isoBaseLengthString = sc.nextLine();
                try {
                    double isoLeg = Double.parseDouble(isoLegLengthString);
                    double isoBase = Double.parseDouble(isoBaseLengthString);
                    Shape isosceles = new Isosceles(isoLeg, isoBase);
                    System.out.println(isosceles.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                    System.out.println(e.getMessage());
                }
                break;
            case "8":
                System.out.println("Please enter length A :");
                String scaleneLengthA = sc.nextLine();
                System.out.println("Please enter length B :");
                String scaleneLengthB = sc.nextLine();
                System.out.println("Please enter length C :");
                String scaleneLengthC = sc.nextLine();
                try {
                    double scaleneA = Double.parseDouble(scaleneLengthA);
                    double scaleneB = Double.parseDouble(scaleneLengthB);
                    double scaleneC = Double.parseDouble(scaleneLengthC);
                    Shape scalene = new Scalene(scaleneA, scaleneB, scaleneC);
                    System.out.println(scalene.toString());
                } catch (Exception e) {
                    System.out.println(">>>>>>>   Invalid input   <<<<<<<<");
                    System.out.println(e.getMessage());
                }
                break;
        }
    }
}
