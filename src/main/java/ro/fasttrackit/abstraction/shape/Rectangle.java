package ro.fasttrackit.abstraction.shape;

public class Rectangle implements Shape {
    private final double length;
    private final double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return formatDecimals(length * width);
    }

    @Override
    public double calculatePerimeter() {
        return formatDecimals(2 * (length + width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
