public class Reactangle extends GeometricObject {
    double width;
    double height;

    /**
     * Default constructor.
     */
    public Reactangle() {
        height = 0;
        width = 0;
    }

    /**
     * local parameterized constructor.
     * @param width set the width of Rectangle.
     * @param height set the height of Rectangle.
     */
    public Reactangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Parameterize constructor using super class
     * @param color set the color of Rectangle
     * @param filled set the filled status of Rectangle
     * @param width set the width of Rectangle.
     * @param height set the height of Rectangle.
     */
    public Reactangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /**
     * getter for width
     * @return width of Rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setter of width.
     * @param width set the width of Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getter for height
     * @return height of Rectangle.
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

    /**
     * calculates the area of Rectangle.
     * @return Area of Rectangle
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
