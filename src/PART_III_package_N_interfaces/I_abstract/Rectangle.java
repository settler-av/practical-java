package PART_III_package_N_interfaces.I_abstract;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    /**
     * Default constructor.
     */
    public Rectangle() {
        height = 0;
        width = 0;
    }

    /**
     * local parameterized constructor.
     * @param width set the width of PART_III_package_N_interfaces.I_abstract.Rectangle.
     * @param height set the height of PART_III_package_N_interfaces.I_abstract.Rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Parameterize constructor using super class
     * @param color set the color of PART_III_package_N_interfaces.I_abstract.Rectangle
     * @param filled set the filled status of PART_III_package_N_interfaces.I_abstract.Rectangle
     * @param width set the width of PART_III_package_N_interfaces.I_abstract.Rectangle.
     * @param height set the height of PART_III_package_N_interfaces.I_abstract.Rectangle.
     */
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /**
     * getter for width
     * @return width of PART_III_package_N_interfaces.I_abstract.Rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setter of width.
     * @param width set the width of PART_III_package_N_interfaces.I_abstract.Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getter for height
     * @return height of PART_III_package_N_interfaces.I_abstract.Rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * setter of height of rectangle.
     * @param height set the height of rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tPART_III_package_N_interfaces.I_abstract.Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    /**
     * calculates the area of PART_III_package_N_interfaces.I_abstract.Rectangle.
     * @return Area of PART_III_package_N_interfaces.I_abstract.Rectangle
     */
    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(height+width);
    }
}
