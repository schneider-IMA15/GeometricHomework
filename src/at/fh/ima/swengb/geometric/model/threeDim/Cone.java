package at.fh.ima.swengb.geometric.model.threeDim;

import static java.lang.Math.sqrt;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class Cone extends Shape3D {
    private double r;
    private double h;
    private double s;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        this.s = sqrt(r*r+h*h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.r, r) != 0) return false;
        return Double.compare(cone.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateVolume() {
        return ((Math.PI)/3)*r*r*h;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI*r*(r+s);
    }
}
