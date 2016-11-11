package at.fh.ima.swengb.geometric.model.twoDim.circular;

import at.fh.ima.swengb.geometric.model.twoDim.Shape2D;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class CircularSegment extends CircularShape {

    private double angle;

    public CircularSegment(int x, int y, double radius, double angle) {
        super(radius);
        this.x=x;
        this.y=y;
        this.angle = angle*(Math.PI)/180;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CircularSegment that = (CircularSegment) o;

        if (Double.compare(that.radius, radius) != 0) return false;
        return Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(angle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateArea() {
        return ((radius*radius)/2)*(angle-(Math.sin(angle)));
    }

    @Override
    public double calculatePerimeter() {
        return radius*angle;
    }
}
