
package Main;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder test = new Cylinder();
        System.out.println(test.getArea());
        Cylinder test2 = new Cylinder(Math.sqrt(Math.pow(Math.PI,-1)));
        System.out.println(test2.getArea());
        Cylinder test3 = new Cylinder(13,12);
        System.out.println(test3.getArea());
    }
}
