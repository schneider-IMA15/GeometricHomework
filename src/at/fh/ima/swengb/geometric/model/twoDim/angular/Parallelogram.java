package at.fh.ima.swengb.geometric.model.twoDim.angular;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class Parallelogram extends AngularShape {

    private double b;
    private double h;
    private String error = "You choose an illegal value for B, it has to be at least as large as H. ";

    public Parallelogram(int x, int y, double a, double b, double h) {
        super(a);
        this.x = x;
        this.y = y;
        if (b < h){this.b = h; System.out.println(error + "B has been set to match H");}
        else {this.b = b;};
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < h){
            System.out.println(error + "No changes were made.");
        }
        else
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parallelogram that = (Parallelogram) o;

        if (Double.compare(that.a, a) != 0) return false;
        if (Double.compare(that.b, b) != 0) return false;
        return Double.compare(that.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateArea() {
        return a*h;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }
}
