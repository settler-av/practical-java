package PART_III_package_N_interfaces.I_abstract;

import java.util.Date;

/**
 * @author 20CE155 ADNAN VAHORA
 * @since 31/8/2021.
 * Aim - Create an abstract class PART_III_package_N_interfaces.I_abstract.GeometricObject as the superclass for PART_III_package_N_interfaces.I_abstract.Circle and
 *      PART_III_package_N_interfaces.I_abstract.Rectangle. PART_III_package_N_interfaces.I_abstract.GeometricObject models common features of geometric objects. Both
 *      PART_III_package_N_interfaces.I_abstract.Circle and PART_III_package_N_interfaces.I_abstract.Rectangle contain the getArea() and getPerimeter() methods for
 *      computing the area and perimeter of a circle and a rectangle. Since you can
 *      compute areas and perimeters for all geometric objects, so define the getArea() and
 *      getPerimeter() methods in the PART_III_package_N_interfaces.I_abstract.GeometricObject class. Give implementation in the
 *      specific type of geometric object. Create PART_III_package_N_interfaces.I_abstract.TestGeometricObject class to display area
 *      and perimeter of PART_III_package_N_interfaces.I_abstract.Rectangle and Triangle, compare area of both and display results.
 */


public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    /**
     * Default constructor.
     */
    public GeometricObject() {

    }

    /**
     * parameterized constructor
     * @param color to set the color of geometric object
     * @param filled whether the shape is filled or not.
     */
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * To get the color of geometric shape
     * @return the color of shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter to set the color of object.
     * @param color set the color to "color"
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Setter to set the fill of shape
     * @param filled write true or false accordingly.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Getter to know the fill status of shape.
     * @return true or false accordingly.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * getter of the date.
     * @return the date when the object was created.
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "PART_III_package_N_interfaces.I_abstract.GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    /**
     * Abstract method that will be overridden by Class PART_III_package_N_interfaces.I_abstract.Circle and rectangle.
     * @return the area of shape.
     */
    abstract double getArea();

    /**
     * Abstract method that will be overridden by Class PART_III_package_N_interfaces.I_abstract.Circle and rectangle.
     * @return return the perimeter of shape.
     */
    abstract double getPerimeter();
}
