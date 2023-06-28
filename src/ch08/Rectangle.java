package ch08;

public class Rectangle implements Shape, Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculaterArea() {
        return width * height;
    }
    @Override
    public double calculaterPerimeter() {
        return 2 * (width * height);
    }

    public void drawLines() {

    }
}
