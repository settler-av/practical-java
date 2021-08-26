package Main;

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
