package at.fh.ima.swengb.geometric.model.twoDim.angular;

import static java.lang.Math.sqrt;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class Rhombus extends AngularShape {

    private double e;
    private double f;

    public Rhombus(int x, int y, double e, double f) {
        this.x = x;
        this.y = y;
        this.e = e;
        this.f = f;
        this.a = sqrt((e/2)*(e/2)+(f/2)*(f/2));
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rhombus rhombus = (Rhombus) o;

        if (Double.compare(rhombus.e, e) != 0) return false;
        return Double.compare(rhombus.f, f) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(e);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(f);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateArea() {
        return e*f/2;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }
}
