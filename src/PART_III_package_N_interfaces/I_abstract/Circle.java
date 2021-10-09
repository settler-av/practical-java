package PART_III_package_N_interfaces.I_abstract;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends GeometricObject {
    private double radius;

    /**
     * Default Constructor
     */
    public Circle() {
        radius = 0;
    }

    /**
     * parameterized constructor
     * @param radius sets the radius at the time of creating object.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * parameterized constructor with super class member initializer
     * @param color sets the color of PART_III_package_N_interfaces.I_abstract.Circle.
     * @param filled set the filled status of PART_III_package_N_interfaces.I_abstract.Circle.
     * @param radius sets the radius of PART_III_package_N_interfaces.I_abstract.Circle.
     */
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * getter of data member radius.
     * @return radius of circle.
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return Diameter of PART_III_package_N_interfaces.I_abstract.Circle.
     */
    double getDiameter(){
        return 2*getRadius();
    }

    @Override
    public String toString() {

        return super.toString()+"\n\tPART_III_package_N_interfaces.I_abstract.Circle{" +
                "radius=" + radius +
                '}';
    }

    /**
     * Calculates Area of PART_III_package_N_interfaces.I_abstract.Circle.
     * @return Area of circle.
     */
    @Override
    double getArea() {
        return PI*pow(radius,2);
    }

    /**
     * calculates the perimeter of circle.
     * @return Perimeter of circle.
     */
    @Override
    double getPerimeter() {
        return 2*PI*radius;
    }
}
