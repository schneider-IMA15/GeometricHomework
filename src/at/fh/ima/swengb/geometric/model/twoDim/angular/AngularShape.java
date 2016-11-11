package at.fh.ima.swengb.geometric.model.twoDim.angular;

import at.fh.ima.swengb.geometric.model.twoDim.Shape2D;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class AngularShape extends Shape2D {
    protected double a;

    public AngularShape(double a) {
        this.a = a;
    }

    public AngularShape(){}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
