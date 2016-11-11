package at.fh.ima.swengb.geometric.model.threeDim;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class QuadraticPyramid extends Shape3D {

    private double a;
    private double h;

    public QuadraticPyramid(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        QuadraticPyramid that = (QuadraticPyramid) o;

        if (Double.compare(that.a, a) != 0) return false;
        return Double.compare(that.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        return (a*a)+2*a*h;
    }

    @Override
    public double calculateSurfaceArea() {
        return a*a*h/3;
    }
}
