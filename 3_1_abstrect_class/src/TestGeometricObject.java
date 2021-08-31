public class TestGeometricObject {
    public static void main(String[] args) {
        //Creating Object of Circle
        Circle testCircle = new Circle("Red",false,3);
        System.out.println("Circle created \n"+testCircle.toString());

        //Creating Object of Rectangle
        Rectangle testRectangle = new Rectangle("Blue",true,2,3);
        System.out.println("Rectangle created \n" + testRectangle.toString());

        //Comparing area of shapes
        System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-++-+-+-+-+-+-+-++-+-+-+\n");
        System.out.println("Comparing Area of Shapes");
        String areaResult = testCircle.getArea()>testRectangle.getArea()?"\n\tArea of circle is Greater":"\n\tArea of Rectangle is greater.";
        System.out.println("Circle : " + testCircle.getArea());
        System.out.println("Rectangle : " + testRectangle.getArea());
        System.out.println(areaResult);

        //Comparing perimeter of shapes.
        System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-++-+-+-+-+-+-+-++-+-+-+\n");
        System.out.println("Comparing perimeter of Shapes");
        System.out.println("Circle : " + testCircle.getPerimeter());
        System.out.println("Rectangle : " + testRectangle.getPerimeter());
        String perimeterResult = testCircle.getPerimeter()>testRectangle.getPerimeter()?"\n\tPerimeter of circle is Greater":"\n\tPerimeter of Rectangle is greater.";
        System.out.println(perimeterResult);
    }
}
