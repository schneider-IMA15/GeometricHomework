package at.fh.ima.swengb.geometric.model.twoDim.circular;

import at.fh.ima.swengb.geometric.model.twoDim.Shape2D;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public abstract class CircularShape extends Shape2D {
    protected double radius;

    public CircularShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
