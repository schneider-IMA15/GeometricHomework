package at.fh.ima.swengb.geometric.model.twoDim;

import at.fh.ima.swengb.geometric.model.GeometricShape;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public abstract class Shape2D extends GeometricShape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
