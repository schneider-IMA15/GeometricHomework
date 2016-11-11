package at.fh.ima.swengb.geometric.model.threeDim;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class Cylinder extends Shape3D {

    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.r, r) != 0) return false;
        return Double.compare(cylinder.h, h) == 0;
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
        return Math.PI*r*r*h;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*Math.PI*r*(r+h);
    }
}
