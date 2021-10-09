package PART_III_package_N_interfaces.I_abstract;

public class TestGeometricObject {
    public static void main(String[] args) {
        //Creating Object of PART_III_package_N_interfaces.I_abstract.Circle
        Circle testCircle = new Circle("Red",false,3);
        System.out.println("PART_III_package_N_interfaces.I_abstract.Circle created \n"+ testCircle);

        //Creating Object of PART_III_package_N_interfaces.I_abstract.Rectangle
        Rectangle testRectangle = new Rectangle("Blue",true,2,3);
        System.out.println("PART_III_package_N_interfaces.I_abstract.Rectangle created \n" + testRectangle);

        //Comparing area of shapes
        System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-++-+-+-+-+-+-+-++-+-+-+\n");
        System.out.println("Comparing Area of Shapes");
        String areaResult = testCircle.getArea()>testRectangle.getArea()?"\n\tArea of circle is Greater":"\n\tArea of PART_III_package_N_interfaces.I_abstract.Rectangle is greater.";
        System.out.println("PART_III_package_N_interfaces.I_abstract.Circle : " + testCircle.getArea());
        System.out.println("PART_III_package_N_interfaces.I_abstract.Rectangle : " + testRectangle.getArea());
        System.out.println(areaResult);

        //Comparing perimeter of shapes.
        System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-++-+-+-+-+-+-+-++-+-+-+\n");
        System.out.println("Comparing perimeter of Shapes");
        System.out.println("PART_III_package_N_interfaces.I_abstract.Circle : " + testCircle.getPerimeter());
        System.out.println("PART_III_package_N_interfaces.I_abstract.Rectangle : " + testRectangle.getPerimeter());
        String perimeterResult = testCircle.getPerimeter()>testRectangle.getPerimeter()?"\n\tPerimeter of circle is Greater":"\n\tPerimeter of PART_III_package_N_interfaces.I_abstract.Rectangle is greater.";
        System.out.println(perimeterResult);
    }
}
