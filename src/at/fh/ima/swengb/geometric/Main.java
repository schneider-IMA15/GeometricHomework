package at.fh.ima.swengb.geometric;

import at.fh.ima.swengb.geometric.model.GeometricShape;
import at.fh.ima.swengb.geometric.model.threeDim.Cone;
import at.fh.ima.swengb.geometric.model.threeDim.Cylinder;
import at.fh.ima.swengb.geometric.model.threeDim.QuadraticPyramid;
import at.fh.ima.swengb.geometric.model.threeDim.Shape3D;
import at.fh.ima.swengb.geometric.model.twoDim.Shape2D;
import at.fh.ima.swengb.geometric.model.twoDim.angular.Parallelogram;
import at.fh.ima.swengb.geometric.model.twoDim.angular.Rhombus;
import at.fh.ima.swengb.geometric.model.twoDim.circular.CircularSegment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukas Schneider on 11.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        //main.testStuff();

        List<Shape2D> shapeList2D = new ArrayList<>();

        shapeList2D.add(new CircularSegment(0,0,30,40));
        shapeList2D.add(new CircularSegment(0,0,40,50));
        shapeList2D.add(new Parallelogram(0,0,10,50,30));
        shapeList2D.add(new Parallelogram(0,0,20,60,40));
        shapeList2D.add(new Rhombus(0,0,15,25));
        shapeList2D.add(new Rhombus(0,0,25,35));

        double sumOfAreas = 0;
        double sumOfPerimeters = 0;

        for (Shape2D shape : shapeList2D) {
            sumOfAreas += shape.calculateArea();
            sumOfPerimeters += shape.calculatePerimeter();
        }

        System.out.println("Sum of Areas = " + sumOfAreas);
        System.out.println("Sum of Perimeters = " + sumOfPerimeters);

        List<Shape3D> shapeList3D = new ArrayList<>();
        shapeList3D.add(new QuadraticPyramid(10,20));
        shapeList3D.add(new Cone(30,40));
        shapeList3D.add(new Cylinder(50,60));

        double sumOfVolumes = 0;
        double sumOfSurfaces = 0;

        for (Shape3D shape : shapeList3D) {
            sumOfVolumes += shape.calculateVolume();
            sumOfSurfaces += shape.calculateSurfaceArea();
        }

        System.out.println("Sum of Volumes = " + sumOfVolumes);
        System.out.println("Sum of Surfaces = " + sumOfSurfaces);
    }

    public void testStuff() {
        CircularSegment test = new CircularSegment(0,0,15,30);
        System.out.println(test.calculateArea());
        System.out.println(test.calculatePerimeter());

        Parallelogram test2 = new Parallelogram(0,0,10,5,8);
        test2.setB(5);
        Shape2D test3 = new Parallelogram(0,0,10,8,8);
        Parallelogram test4 = new Parallelogram(0,0,20,10,5);

        System.out.println(test2.equals(test3));

        System.out.println(test2.calculateArea());
        System.out.println(test2.calculatePerimeter());

        System.out.println(test4.calculateArea());
        System.out.println(test4.calculatePerimeter());

        Rhombus test5 = new Rhombus(0,0,10,5);
        System.out.println(test5.calculateArea());
        System.out.println(test5.calculatePerimeter());
    }

    public void printList() {

    }
}
