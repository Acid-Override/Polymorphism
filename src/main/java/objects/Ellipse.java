package objects;

import java.util.Objects;

public class Ellipse extends Polygon {



    public Ellipse(double aAxis, double bAxis) {
        super(aAxis, bAxis);
        if(aAxis <= 0 || bAxis <= 0)
            throw new RuntimeException("Invalid dimension for Ellipse.");
    }


//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Ellipse)) return false;
//        Ellipse ellipse = (Ellipse) o;
//        return ellipse.getArea() == this.getArea() && ellipse.getPerimeter() == this.getPerimeter();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getaAxis(), getbAxis());
//    }
}
