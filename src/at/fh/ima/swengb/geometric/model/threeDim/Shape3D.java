package at.fh.ima.swengb.geometric.model.threeDim;

import at.fh.ima.swengb.geometric.model.GeometricShape;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */

public abstract class Shape3D extends GeometricShape {

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}