package objects;


public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
        if(radius <= 0)
            throw new RuntimeException("Invalid dimension for Circle");
    }

}
