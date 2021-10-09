package PART_II_OOP.I_constructor;
/**
 * @author 20CE155 ADNAN VAHORA
 * Design a class named Cylinder containing following attributes and behavior.
 *  One double data field named radius. The default value is 1.
 *  One double data field named height. The default value is 1.
 *  A no-argument constructor that creates a default Cylinder.
 *  A Single argument constructor that creates a Cylinder with the specified radius.
 *  Two argument constructor that creates a Cylinder with the specified radius and height.
 *  A method named getArea() that returns area of the Cylinder.
 *  Create a class TestCylinder and test and display result.
 */
public class Cylinder {
    double radius;
    double height;

    Cylinder() {
        System.out.println("Call of default constructor");
        radius = 1;
        height = 1;
    }
    //single argument constructor.
    Cylinder(double radius){
        System.out.println("Call of parameterized constructor with 1 argument");
        this.radius = radius;
    }
    //two argument constructor
    Cylinder(double radius, double height){
        System.out.println("Call of parameterized constructor with 2 args");
        this.radius = radius;
        this.height = height;
    }

    double getArea(){
        return (Math.PI*Math.pow(radius,2)*height);
    }

}
