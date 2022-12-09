package objects.triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RightTriangle extends AbstractTriangle {

    public RightTriangle(BigDecimal base, BigDecimal height) {
        setDimensions(base, height);
        setAngles();
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    @Override
    protected void setAngles() {
        this.setAlphaAngle(BigDecimal.valueOf(Math.toDegrees(Math.asin(getBase().doubleValue()/getHypotenuse().doubleValue()))).setScale(2, RoundingMode.HALF_UP));
        this.setThetaAngle(BigDecimal.valueOf(Math.toDegrees(Math.asin(getHeight().doubleValue()/getHypotenuse().doubleValue()))).setScale(2, RoundingMode.HALF_UP));
        this.setOmegaAngle(BigDecimal.valueOf(180 - (getAlphaAngle().add(getThetaAngle())).doubleValue()));
    }

    private void setDimensions(BigDecimal base, BigDecimal height) {
        setBase(base);
        setHeight(height);
        setHypotenuse(calculateHypotenuse());
    }

    private BigDecimal calculateHypotenuse() {
        return BigDecimal.valueOf(Math.sqrt(Math.pow(getBase().doubleValue(), 2) + Math.pow(getHeight().doubleValue(), 2))).setScale(6, RoundingMode.HALF_UP);
    }

    @Override
    protected BigDecimal calculateArea() {
        double semiPerimeter = getPerimeter().doubleValue()/2;
        double result = 0.5 * getBase().doubleValue() *
                (2/getBase().doubleValue() * Math.sqrt(semiPerimeter *
                        (semiPerimeter - getBase().doubleValue()) *
                        (semiPerimeter - getHeight().doubleValue()) *
                        (semiPerimeter - getHypotenuse().doubleValue())
                ));
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP);
    }
    @Override
    protected BigDecimal calculatePerimeter() {
        return getBase().add(getHeight()).add(getHypotenuse()).setScale(6, RoundingMode.HALF_UP);
    }



}
