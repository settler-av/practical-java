
package PART_II_OOP.I_constructor;

public class TestCylinder {
    public static void main(String[] args) {
        System.out.println("Test 1");
        Cylinder test = new Cylinder();
        System.out.println(test);
        System.out.println("Area: "+test.getArea());
        System.out.println("\nTest 2");
        Cylinder test2 = new Cylinder(Math.sqrt(Math.pow(Math.PI,-1)));
        System.out.println(test2);
        System.out.println("Area: "+test2.getArea());
        System.out.println("\nTest 3");
        Cylinder test3 = new Cylinder(13,12);
        System.out.println(test3);
        System.out.println("Area: "+test3.getArea());
    }
}
